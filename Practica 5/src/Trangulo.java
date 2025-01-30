import java.util.Scanner;
public class Trangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdusca la altura del triángulo : ");
        int altura = scanner.nextInt();


        for (int i = 1; i <= altura; i += 2) {
            for (int j = i; j >= 1; j -= 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

