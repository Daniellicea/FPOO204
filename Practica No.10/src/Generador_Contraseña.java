import java.util.Random;
import javax.swing.JOptionPane;

public class Generador_Contraseña {

    public void longitud_contraseña() {
        String input = JOptionPane.showInputDialog("¿De qué tamaño deseas que sea la longitud de tu contraseña? (1 a 20 caracteres)");

        // Validación de entrada
        int longitud = 8; // Valor por defecto
        try {
            longitud = Integer.parseInt(input);
            if (longitud < 3 || longitud > 20) {
                JOptionPane.showMessageDialog(null, "La longitud debe estar entre 4 y 20. Se usará 8 por defecto.");
                longitud = 8;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Se usará la longitud por defecto de 8 caracteres.");
        }

        // Preguntar qué tipos de caracteres quiere el usuario
        boolean incluirMayusculas = JOptionPane.showConfirmDialog(null, "¿Deseas incluir letras mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean incluirMinusculas = JOptionPane.showConfirmDialog(null, "¿Deseas incluir letras minúsculas?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean incluirNumeros = JOptionPane.showConfirmDialog(null, "¿Deseas incluir números?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean incluirEspeciales = JOptionPane.showConfirmDialog(null, "¿Deseas incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        // Validar que al menos un tipo de caracter haya sido seleccionado
        if (!incluirMayusculas && !incluirMinusculas && !incluirNumeros && !incluirEspeciales) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar al menos un tipo de caracter. Se generará una contraseña con letras y números por defecto.");
            incluirMayusculas = true;
            incluirMinusculas = true;
            incluirNumeros = true;
        }

        // Generar la contraseña
        String contrasena = generarContrasena(longitud, incluirMayusculas, incluirMinusculas, incluirNumeros, incluirEspeciales);

        // Evaluar seguridad
        String seguridad = evaluarSeguridad(longitud, incluirMayusculas, incluirMinusculas, incluirNumeros, incluirEspeciales);

        // Mostrar contraseña generada y su seguridad
        JOptionPane.showMessageDialog(null, "Tu contraseña generada es: " + contrasena + "\nNivel de seguridad: " + seguridad);
    }

    public String generarContrasena(int longitud, boolean mayusculas, boolean minusculas, boolean numeros, boolean especiales) {
        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String espec = "!@#$%^&*()-_=+";

        String caracteresPermitidos = "";
        if (mayusculas) caracteresPermitidos += mayus;
        if (minusculas) caracteresPermitidos += minus;
        if (numeros) caracteresPermitidos += num;
        if (especiales) caracteresPermitidos += espec;

        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteresPermitidos.length());
            contrasena.append(caracteresPermitidos.charAt(index));
        }

        return contrasena.toString();
    }

    public String evaluarSeguridad(int longitud, boolean mayusculas, boolean minusculas, boolean numeros, boolean especiales) {
        int criterios = 0;
        if (mayusculas) criterios++;
        if (minusculas) criterios++;
        if (numeros) criterios++;
        if (especiales) criterios++;

        if (longitud < 10 && criterios <= 2) return "Débil";
        if (longitud >= 10 && criterios == 2) return "Moderada";
        if (longitud >= 12 && criterios >= 3) return "Fuerte";
        if (longitud >= 16 && criterios == 4) return "Muy Fuerte";

        return "Moderada"; // Valor por defecto
    }
}
