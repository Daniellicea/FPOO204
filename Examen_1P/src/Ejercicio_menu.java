import java.util.Scanner;

public class Ejercicio_menu {
    public static double Fahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double Celsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double Kelvin(double celsius) {
        return celsius + 273.15;
    }
    public static void main(String[] args) {
            //crea un programa con funciones que nos permita crear las temperaturas a
            // decision del usuario G: Centrigrados=(fahrenheit - 32)
            // G fahrenheit = (Centrigrados * 9/5) +32
            // G kelvin = (centrigados + 273.15
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de opciones:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.println("3. Celsius a Kelvin");

        int opcion = scanner.nextInt();
        System.out.print("Ingrese la temperatura: ");
        double temperatura = scanner.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("El resultado es: " + Fahrenheit(temperatura) + " °F");
                        break;
            case 2:
                System.out.println("El resultado: " + Celsius(temperatura) + " °C");
                        break;
            case 3:
                System.out.println("El resultado: " + Kelvin(temperatura) + " K");
                        break;
            default:
                System.out.println("Su opción no es válida.");
                }


            }
        }




