import java.util.Scanner;

public class Numero_comprendido_entre_200_y_400 {
    public static void main(String[] args) {
        //crea un programa usando blucles que nos permita pedir un numero par comprendido
        //entre 200 y 400 y nos muestre todos los numeros pares comprendidos entre el numero
        //facilitado y 400. por ejemplo si el numero es 392, que nos muestre 392,394,396,398 y 400
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entre 200 y 400: ");
        int num = scanner.nextInt();

        while (num < 200 || num > 400 || num % 2 != 0) {
            System.out.print("Numero inválido. Intente de nuevo: ");
            num = scanner.nextInt();
        }

        for (int i = num; i <= 400; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
