public class Cuentas {
    public int noCuenta;
    public String titular;
    public int edad;
    public double saldo;

    // Constructor corregido
    public Cuentas(int noCuenta, String titular, int edad, double saldo) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public void mostrarInfo() {
        System.out.println("\nInformación de la Cuenta:");
        System.out.println("No. Cuenta: " + noCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Edad: " + edad);
        System.out.println("Saldo: $" + saldo);
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual de la cuenta " + noCuenta + " es: $" + saldo);
    }

    public void ingresarEfectivo(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado $" + cantidad + " en la cuenta " + noCuenta);
        } else {
            System.out.println("La cantidad debe ser mayor a 0.");
        }
    }

    public void retirarEfectivo(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado $" + cantidad + " de la cuenta " + noCuenta);
        } else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes en la cuenta " + noCuenta);
        } else {
            System.out.println("La cantidad debe ser mayor a 0.");
        }
    }

    public void depositarOtraCuenta(Cuentas otraCuenta, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            otraCuenta.saldo += cantidad;
            System.out.println("Se han transferido $" + cantidad + " de la cuenta " + noCuenta + " a la cuenta " + otraCuenta.noCuenta);
        } else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes en la cuenta " + noCuenta);
        } else {
            System.out.println("La cantidad debe ser mayor a 0.");
        }
    }
}
