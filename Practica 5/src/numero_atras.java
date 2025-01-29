import java.util.Scanner;

public class numero_atras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número positivo: ");
        int numero = scanner.nextInt();
        int i = numero;
        for (i = numero; i >= 0; i--) {
            System.out.print(i+",");

        }
    }
}
