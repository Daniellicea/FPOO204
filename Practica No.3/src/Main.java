//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Cálculo de paga:");
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
        System.out.println("Primera letra en mayúsculas: " + capitalizeWords(nombreCompleto));
        System.out.println();

        }
    }
}