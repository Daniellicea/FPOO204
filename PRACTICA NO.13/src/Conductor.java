import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Conductor {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    public Integer getLicencia() {
        return licencia;
    }

    public void setLicencia(Integer licencia) {
        this.licencia = licencia;
    }

    private Integer licencia;

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    private Integer identificacion;

    public Conductor(String nombre, Integer identificacion, Integer licencia) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }

    // Constructor
    public Conductor() {
        this.nombre = JOptionPane.showInputDialog("¿Cuál es el nombre del conductor?");
        this.identificacion = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el número de identificación del conductor?"));
        this.licencia = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el número de licencia de conductor?"));
    }

    // Método para mostrar información del conductor
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Conductor registrado:\n" +
                "Nombre: " + nombre + "\n" +
                "Identificación: " + identificacion + "\n" +
                "Licencia: " + licencia);
    }
}