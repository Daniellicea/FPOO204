import java.util.Random;
import javax.swing.JOptionPane;

public class Generador_Contraseña {

    private int longitud;
    private boolean incluirMayusculas;
    private boolean incluirMinusculas;
    private boolean incluirNumeros;
    private boolean incluirEspeciales;

    // Constructor
    public Generador_Contraseña() {
        this.longitud = 8;
        this.incluirMayusculas = true;
        this.incluirMinusculas = true;
        this.incluirNumeros = true;
        this.incluirEspeciales = false;
    }

    // Getters y Setters
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        if (longitud >= 3 && longitud <= 20) {
            this.longitud = longitud;
        } else {
            this.longitud = 8;
        }
    }

    public boolean isIncluirMayusculas() {
        return incluirMayusculas;
    }

    public void setIncluirMayusculas(boolean incluirMayusculas) {
        this.incluirMayusculas = incluirMayusculas;
    }

    public boolean isIncluirMinusculas() {
        return incluirMinusculas;
    }

    public void setIncluirMinusculas(boolean incluirMinusculas) {
        this.incluirMinusculas = incluirMinusculas;
    }

    public boolean isIncluirNumeros() {
        return incluirNumeros;
    }

    public void setIncluirNumeros(boolean incluirNumeros) {
        this.incluirNumeros = incluirNumeros;
    }

    public boolean isIncluirEspeciales() {
        return incluirEspeciales;
    }

    public void setIncluirEspeciales(boolean incluirEspeciales) {
        this.incluirEspeciales = incluirEspeciales;
    }

    public void longitud_contraseña() {
        String input = JOptionPane.showInputDialog("¿De qué tamaño deseas que sea la longitud de tu contraseña? (1 a 20 caracteres)");

        try {
            setLongitud(Integer.parseInt(input));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Se usará la longitud por defecto de 8 caracteres.");
        }

        incluirMayusculas = JOptionPane.showConfirmDialog(null, "¿Deseas incluir letras mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        incluirMinusculas = JOptionPane.showConfirmDialog(null, "¿Deseas incluir letras minúsculas?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        incluirNumeros = JOptionPane.showConfirmDialog(null, "¿Deseas incluir números?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        incluirEspeciales = JOptionPane.showConfirmDialog(null, "¿Deseas incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        if (!incluirMayusculas && !incluirMinusculas && !incluirNumeros && !incluirEspeciales) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar al menos un tipo de caracter. Se generará una contraseña con letras y números por defecto.");
            setIncluirMayusculas(true);
            setIncluirMinusculas(true);
            setIncluirNumeros(true);
        }

        String contrasena = generarContrasena();
        String seguridad = evaluarSeguridad();

        JOptionPane.showMessageDialog(null, "Tu contraseña generada es: " + contrasena + "\nNivel de seguridad: " + seguridad);
    }

    public String generarContrasena() {
        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String espec = "!@#$%^&*()-_=+";

        String caracteresPermitidos = "";
        if (incluirMayusculas) caracteresPermitidos += mayus;
        if (incluirMinusculas) caracteresPermitidos += minus;
        if (incluirNumeros) caracteresPermitidos += num;
        if (incluirEspeciales) caracteresPermitidos += espec;

        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteresPermitidos.length());
            contrasena.append(caracteresPermitidos.charAt(index));
        }

        return contrasena.toString();
    }

    public String evaluarSeguridad() {
        int criterios = (incluirMayusculas ? 1 : 0) + (incluirMinusculas ? 1 : 0) + (incluirNumeros ? 1 : 0) + (incluirEspeciales ? 1 : 0);

        if (longitud < 10 && criterios <= 2) return "Débil";
        if (longitud >= 10 && criterios == 2) return "Moderada";
        if (longitud >= 12 && criterios >= 3) return "Fuerte";
        if (longitud >= 16 && criterios == 4) return "Muy Fuerte";

        return "Moderada";
    }
}