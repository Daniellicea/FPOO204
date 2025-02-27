import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Vehiculo  miVehiculo = null;
        Conductor  miConductor = null;
        Envíos miEnvio = null;

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
                        String op = JOptionPane.showInputDialog("¿Desea que su envío incluya el peso? (Si/No)");

                        if (op.equalsIgnoreCase("Si")) {
                            miEnvio = Envíos.crearEnvio();
                        } else {
                            Integer codigoEnvio = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el código de envío?"));
                            String destino = JOptionPane.showInputDialog("¿Cuál es el destino del envío?");
                            miEnvio = new Envíos(codigoEnvio, destino);
                        }

                        break;
                    case "5":
                        if (miEnvio != null) {
                            miEnvio.registrarEntrega();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay envíos registrados.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;

                    case "6":
                        if (miEnvio != null) {
                            miEnvio.actualizarEstadoEntrega();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay envíos registrados.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "7":
                        if (miVehiculo != null) {
                            miVehiculo.mostrarInfo();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay vehículos registrados.", "Información", JOptionPane.INFORMATION_MESSAGE);
                        }

                        if (miConductor != null) {
                            miConductor.mostrarInfo();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay conductores registrados.", "Información", JOptionPane.INFORMATION_MESSAGE);
                        }

                        if (miEnvio != null) {
                            miEnvio.mostrarInfo();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay envíos registrados.", "Información", JOptionPane.INFORMATION_MESSAGE);
                        }
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
