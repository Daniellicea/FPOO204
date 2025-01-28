import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Intruduce el numero de horas trabajadas: ");
        int horas = scanner.nextInt();
        System.out.print("Introduce el costo por hora: ");
        double costo_por_hora = scanner.nextDouble();
        double paga = horas * costo_por_hora;
        System.out.println("La total a pagar es: " + paga);

        // 2. Preguntar nombre del usuario
        System.out.print("Introduce tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        System.out.println("Minúsculas: " + nombreCompleto.toLowerCase());
        System.out.println("Mayúsculas: " + nombreCompleto.toUpperCase());
        //System.out.println("Primera letra en mayúsculas: " + toUpperCase(nombreCompleto));
        System.out.println();

        // 3. Sumar numeros enteros hasta X
        System.out.print("Introduce un número entero X: ");
        int x = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= x; i++) {
            suma += i;
        }

        //4. Letras del nombre
        System.out.print("Introduce tu nombre: ");
        String nombreUsuario = scanner.nextLine();
        int numLetras = nombreUsuario.replace(" ", "").length();
        System.out.println(nombreUsuario.toUpperCase() + " tiene " + numLetras + " letras.");
        System.out.println();
    }
}