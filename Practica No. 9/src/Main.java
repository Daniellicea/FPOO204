import javax.swing.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear cuentas bancarias
        Cuentas cuenta1 = new Cuentas(12345, "Juan Pérez", 30, 1000.0);
        Cuentas cuenta2 = new Cuentas(67890, "María López", 25, 500.0);

        // Mostrar información de las cuentas
        cuenta1.mostrarInfo();
        cuenta2.mostrarInfo();

        // Realizar operaciones en la cuenta 1
        cuenta1.consultarSaldo();
        cuenta1.ingresarEfectivo(200.0);
        cuenta1.consultarSaldo();
        cuenta1.retirarEfectivo(300.0);
        cuenta1.consultarSaldo();

        // Realizar operaciones en la cuenta 2
        cuenta2.consultarSaldo();
        cuenta2.retirarEfectivo(600.0); // Fondos insuficientes
        cuenta2.consultarSaldo();

        // Transferir de la cuenta 1 a la cuenta 2
        cuenta1.depositarOtraCuenta(cuenta2, 400.0);
        cuenta1.consultarSaldo();
        cuenta2.consultarSaldo();
    }
}