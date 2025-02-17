import javax.swing.*;
import java.util.Random;

public class Cuentas {

    public void crear_cuenta(String nombre_cuenta, int edad, int saldo) {
        int i = 0;
        Random random = new Random();
        String mensaje = "Cuenta creada con éxito:\n" +
                "ID de la cuenta: " + i++ + "\n" +
                "Número de cuenta: " + random.nextInt(5) + "\n" +
                "Nombre del titular: " + nombre_cuenta + "\n" +
                "Edad del titular: " + edad + "\n" +
                "Saldo inicial: " + saldo;
        JOptionPane.showMessageDialog(null, mensaje, "Cuenta Creada", JOptionPane.INFORMATION_MESSAGE);
    }

}
