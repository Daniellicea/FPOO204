import java.util.Scanner;

public class Numero_positivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número positivo.");
        } else {
            System.out.print("Números impares desde 1 hasta " + numero + ": ");
            for (int i = 1; i <= numero; i += 2) {
                if (i > 1) {
                    System.out.print(", ");
                }
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
