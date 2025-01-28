import java.util.Scanner;

public class Par_o_impar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        if ((num % 2) == 0) {
            System.out.printf("El número %d es par.\n", num);
        } else {
            System.out.printf("El número %d es impar.\n", num);
        }


    }
}
