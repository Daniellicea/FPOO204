import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Vehiculo {
    public Integer getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Integer capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    private String modelo;
    private String placa;
    private Integer capacidadCarga;
    private Conductor conductor;

    public Vehiculo(String placa, String modelo, Integer capacidadCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
    }

    public Vehiculo() {
        this.modelo = JOptionPane.showInputDialog("¿Qué modelo de carro es su auto?");
        this.placa = JOptionPane.showInputDialog("¿Qué placa tiene su auto?");
        this.capacidadCarga = Integer.parseInt(JOptionPane.showInputDialog("¿Qué capacidad de carga tiene su auto?"));
    }

    // Método para mostrar la información del vehículo
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Vehículo registrado:\n" +
                "Placa: " + placa + "\n" +
                "Modelo: " + modelo + "\n" +
                "Capacidad de Carga: " + capacidadCarga + " kg");
    }



}
