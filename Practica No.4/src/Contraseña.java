import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contrasenia = "Qwerty1717";
        String contra = "";
        System.out.printf("Ingrese su contraseña");
        contra =  scanner.nextLine();

        if (contrasenia.equals(contra)){
            System.out.printf("Contraseña correcta");
        }else{
            System.out.printf("Contraseña incorrecta");
        }



    }

}
