import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Envíos {
    public Integer getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(Integer codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    private Integer codigoEnvio;

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    private String destino;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    private Double peso;

    public void Envíos_con_peso(Integer codigoEnvio, String destino , Double peso) {
        String Envio_codigoEnvio = JOptionPane.showInputDialog("¿Cual es el codigo de envio?");
        Integer Envio_destino = (parseInt(JOptionPane.showInputDialog("¿Cual es el destino del envio?")));
        Integer Envio_peso = (parseInt(JOptionPane.showInputDialog("¿Cual es el peso del envio?")));
    }

    public Envíos(Integer codigoEnvio, String destino) {
        String Envio_codigoEnvio = JOptionPane.showInputDialog("¿Cual es el codigo de envio?");
        Integer Envio_destino = (parseInt(JOptionPane.showInputDialog("¿Cual es el destino del envio?")));
    }


    }
    //Implementar un método estático crearEnvio

