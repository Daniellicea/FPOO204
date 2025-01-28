import java.util.Scanner;

public class polidromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        String reverso = new StringBuilder(cadena).reverse().toString();

        if (cadena.equals(reverso)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }

    }
}
