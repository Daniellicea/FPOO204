import javax.swing.*;

public class Envíos {
    private Integer codigoEnvio;
    private String destino;
    private Double peso;
    private boolean entregado;

    // Constructor con todos los parámetros
    public Envíos(Integer codigoEnvio, String destino, Double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
        this.entregado = false;
    }

    // Constructor sin peso
    public Envíos(Integer codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0.0; // Valor por defecto
        this.entregado = false;
    }

    public Integer getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(Integer codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    // Método estático para crear un envío con datos ingresados por el usuario
    public static Envíos crearEnvio() {
        Integer codigoEnvio = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el código de envío?"));
        String destino = JOptionPane.showInputDialog("¿Cuál es el destino del envío?");
        Double peso = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el peso del envío en kg?"));

        return new Envíos(codigoEnvio, destino, peso);
    }

    // Método para mostrar información
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null,
                "Información del Envío:\n" +
                        "Código: " + codigoEnvio + "\n" +
                        "Destino: " + destino + "\n" +
                        "Peso: " + peso + " kg");
    }

    public void registrarEntrega() {
        this.entregado = true;
        JOptionPane.showMessageDialog(null, "Entrega registrada con éxito para el envío con código: " + codigoEnvio);
    }

    public void actualizarEstadoEntrega() {
        String[] opciones = {"Pendiente", "En tránsito", "Entregado"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el estado del envío:",
                "Actualizar Estado de Entrega",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                opciones, opciones[0]);

        if (seleccion == 2) { // "Entregado"
            this.entregado = true;
        } else {
            this.entregado = false;
        }

        JOptionPane.showMessageDialog(null, "Estado de entrega actualizado: " + opciones[seleccion]);
    }

}
