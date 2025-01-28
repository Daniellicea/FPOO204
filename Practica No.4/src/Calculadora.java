import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Suma = + \nResta = -\nMultiplicacion = *\nDiviasion = /\n " +
                "Ingrese una opcion de la calculadora: ");
        String Op = scanner.nextLine();

        int num1, num2;

        switch (Op){
            case "+":
                System.out.print("Ingrese su primer numero  : ");
                num1 = scanner.nextInt();
                System.out.print("Ingrese su segundo numero  : ");
                num2 = scanner.nextInt();
                int suma = num1 + num2;
                System.out.print(suma);
                break;
                case "-":
                    System.out.print("Ingrese su primer numero  : ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese su segundo numero  : ");
                    num2 = scanner.nextInt();
                    int resta = num1 - num2;
                    System.out.print(resta);
                    break;
                    case "*":
                        System.out.print("Ingrese su primer numero  : ");
                        num1 = scanner.nextInt();
                        System.out.print("Ingrese su segundo numero  : ");
                        num2 = scanner.nextInt();
                        int multi = num1 * num2;
                        System.out.print(multi);
                        break;
                        case "/":
                            System.out.print("Ingrese su primer numero  : ");
                            num1 = scanner.nextInt();
                            System.out.print("Ingrese su segundo numero  : ");
                            num2 = scanner.nextInt();
                            int div = num1 / num2;
                            System.out.print(div);
                            break;
                            default:
                                System.out.print("Opcion no valida");
                                break;

        }
    }
}
