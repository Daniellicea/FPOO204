import javax.swing.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Se requiere un programa para la administración de cuenta en caja
        //popular, con el programa podremos consultar saldo, ingresar
        //efectivo, retirar efectivo y depositar a otra cuenta, cada cuenta tiene
        //registrados los siguientes datos No.Cuenta, titular, edad, saldo
        Funciones Fun = new Funciones();
        Cuentas cuentas = new Cuentas();


        String nombre_cuenta = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular:"));
        int saldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el saldo inicial:"));

        cuentas.crear_cuenta(Id_cuenta, no_cuenta, nombre_cuenta, edad, saldo);

    }
}

