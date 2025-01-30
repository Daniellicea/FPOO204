import java.util.Scanner;

public class bitacora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 0;
        String entrada;

        System.out.println("Ingrese operación (D para depósito, R para retiro, S para salir).");

        while (true) {
            entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("S")) {
                break;
            }

            char operacion = entrada.charAt(0);
            int cantidad = Integer.parseInt(entrada.substring(2));

            if (operacion == 'D') {
                saldo += cantidad;
            } else if (operacion == 'R') {
                saldo -= cantidad;  
            }
        }

        scanner.close();
        System.out.println("Saldo final: " + saldo + " pesos.");
    }
}
