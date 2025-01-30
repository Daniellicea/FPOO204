import java.util.Scanner;

public class Letra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Introduce una letra: ");
        char letra = scanner.next().charAt(0);

        scanner.close();

        int contador = 0;


        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
    }
}
