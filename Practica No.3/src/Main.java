import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Calcular la paga
        System.out.println("Introduce el número de horas trabajadas: ");
        int horas = scanner.nextInt();
        System.out.print("Introduce el costo por hora: ");
        double costo_por_hora = scanner.nextDouble();
        double paga = horas * costo_por_hora;
        System.out.println("La total a pagar es: " + paga);

        // 2. Preguntar nombre del usuario
        scanner.nextLine(); // Limpiar el salto de línea pendiente
        System.out.print("Introduce tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        System.out.println("Minúsculas: " + nombreCompleto.toLowerCase());
        System.out.println("Mayúsculas: " + nombreCompleto.toUpperCase());
        System.out.println();

        // 3. Sumar números enteros hasta X
        System.out.print("Introduce un número entero X: ");
        int x = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= x; i++) {
            suma += i;
        }
        System.out.println("La suma de los números hasta " + x + " es: " + suma);

        // 4. Letras del nombre
        scanner.nextLine(); // Limpiar el salto de línea pendiente
        System.out.print("Introduce tu nombre: ");
        String nombreUsuario = scanner.nextLine();
        int numLetras = nombreUsuario.replace(" ", "").length();
        System.out.println(nombreUsuario.toUpperCase() + " tiene " + numLetras + " letras.");
        System.out.println();

        // 5. Juguetería
        System.out.print("Introduce el número de payasos: ");
        int numPayasos = scanner.nextInt();
        System.out.print("Introduce el número de muñecas: ");
        int numMunecas = scanner.nextInt();
        final int PESO_PAYASO = 112, PESO_MUNECA = 75;
        int pesoTotal = (numPayasos * PESO_PAYASO) + (numMunecas * PESO_MUNECA);
        System.out.println("El peso total es: " + pesoTotal);

        // 6. Invertir palabra
        scanner.nextLine(); // Limpiar el salto de línea pendiente
        System.out.println("Ingresa una frase: ");
        String frase = scanner.nextLine();
        System.out.println("Frase invertida: " + new StringBuilder(frase).reverse().toString());
    }
}
