import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;

public class Cuentas {
    private ArrayList<Integer> folio = new ArrayList<Integer>();
    private ArrayList<Integer> id = new ArrayList<>();
    private ArrayList<String> titular_cuenta = new ArrayList<>();
    private ArrayList<Integer> edad_cuenta = new ArrayList<Integer>();
    private ArrayList<Integer> saldo_cuenta = new ArrayList<>();



    public void crear_cuenta(String nombre_cuenta, int edad, int saldo) {
        int i = 0;
        Random random = new Random();
        int numerofolio=  random.nextInt(5);
        String mensaje = "Cuenta creada con éxito:\n" +
                "ID de la cuenta: " + i++ + "\n" +
                "Número de cuenta: " + random.nextInt(5) + "\n" +
                "Nombre del titular: " + nombre_cuenta + "\n" +
                "Edad del titular: " + edad + "\n" +
                "Saldo inicial: " + saldo;
        id.add(i);
        folio.add(numerofolio);
        titular_cuenta.add(nombre_cuenta);
        edad_cuenta.add(edad);
        saldo_cuenta.add(saldo);

        JOptionPane.showMessageDialog(null, mensaje, "Cuenta Creada", JOptionPane.INFORMATION_MESSAGE);
    }

}
