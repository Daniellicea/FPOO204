import java.util.Scanner;

public class Edades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una edad: ");
        int num = scanner.nextInt();

        if(num<4){
            System.out.print("Entrada gratis ");
        } else if (num >= 4 && num <= 18) {
            System.out.print("Tiene que pagar $118 pesos");
        } else {
            System.out.print("Tiene que pagar $190 pesos");
        }



    }
}

