import javax.swing.JOptionPane;

public class Cuentas {
    private int noCuenta;
    private String titular;
    private int edad;
    private double saldo;

    public Cuentas(int noCuenta, String titular, int edad, double saldo) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "\nInformación de la Cuenta:\n" +
                "No. Cuenta: " + noCuenta + "\n" +
                "Titular: " + titular + "\n" +
                "Edad: " + edad + "\n" +
                "Saldo: $" + saldo);
    }

    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "El saldo actual de la cuenta " + noCuenta + " es: $" + saldo);
    }

    public void ingresarEfectivo(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            JOptionPane.showMessageDialog(null, "Se han depositado $" + cantidad + " en la cuenta " + noCuenta);
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void retirarEfectivo(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null, "Se han retirado $" + cantidad + " de la cuenta " + noCuenta);
        } else if (cantidad > saldo) {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes en la cuenta " + noCuenta, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void depositarOtraCuenta(Cuentas otraCuenta, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            otraCuenta.saldo += cantidad;
            JOptionPane.showMessageDialog(null, "Se han transferido $" + cantidad + " de la cuenta " + noCuenta + " a la cuenta " + otraCuenta.noCuenta);
        } else if (cantidad > saldo) {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes en la cuenta " + noCuenta, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
