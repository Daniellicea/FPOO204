import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        while (true) {
            String[] opciones = {"Agregar Empleado", "Listar Empleados", "Salir"};
            int eleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú de Gestión de Empleados",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            if (eleccion == 0) {
                String[] tiposEmpleado = {"Conductor", "Administrativo"};
                int tipo = JOptionPane.showOptionDialog(null, "Seleccione el tipo de empleado", "Tipo de Empleado",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tiposEmpleado, tiposEmpleado[0]);

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

                if (tipo == 0) {
                    String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
                    empleados.add(new Conductor(nombre, id, salario, licencia));
                } else {
                    String departamento = JOptionPane.showInputDialog("Ingrese el departamento del administrativo:");
                    empleados.add(new Administrativo(nombre, id, salario, departamento));
                }
            } else if (eleccion == 1) {
                StringBuilder listaEmpleados = new StringBuilder();
                for (Empleado emp : empleados) {
                    emp.mostrarInfo();
                }
            } else {
                break;
            }
        }
    }
}