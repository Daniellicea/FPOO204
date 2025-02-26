import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Vehiculo  miVehiculo = null;
        Conductor  miConductor = null;
        boolean salir = false;
        while (!salir) {
            String opcion = JOptionPane.showInputDialog(null,
                    "Menú de Opciones:\n" +
                            "1. Registrar Vehículo\n" +
                            "2. Registrar Conductor\n" +
                            "3. Asignar Conductor\n" +
                            "4. Registrar Envío\n" +
                            "5. Registrar Entrega\n" +
                            "6. Actualizar Estado de Entrega\n" +
                            "7. Mostrar Información\n" +
                            "8. Salir\n\n" +
                            "Seleccione una opción:");

                if (opcion == null) {
                    salir = true;
                    continue;
                }

                switch (opcion) {
                    case "1":
                        miVehiculo = new Vehiculo();
                        break;
                    case "2":
                        miConductor = new Conductor();
                        break;
                    case "3":
                        if (miConductor != null) {
                            miConductor.mostrarInfo();
                        } else {
                            JOptionPane.showMessageDialog(null, "Primero debes registrar un conductor.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "4":
                        JOptionPane.showMessageDialog(null, "Opción: Registrar Envío seleccionada");
                        break;
                    case "5":
                        JOptionPane.showMessageDialog(null, "Opción: Registrar Entrega seleccionada");
                        break;
                    case "6":
                        JOptionPane.showMessageDialog(null, "Opción: Actualizar Estado de Entrega seleccionada");
                        break;
                    case "7":
                        JOptionPane.showMessageDialog(null, "Opción: Mostrar Información seleccionada");

                        break;
                    case "8":
                        salir = true;
                        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
