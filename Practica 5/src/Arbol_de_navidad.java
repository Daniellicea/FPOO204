import java.util.Scanner;

public class Arbol_de_navidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número positivo: ");
        int numero = scanner.nextInt();
        int i,j,k;

        for(i=1; i<numero+(numero/2); i++){
            for(j=numero+(numero/2); j>i; j--){
                System.out.print(" ");}

            for(k=1; k<=2*i-1; k++){
                System.out.print("*");}
            System.out.println("");
        }
        for(i=1; i<numero-(numero/2); i++){
            for(j=numero+(numero/2); j>1; j--){
                System.out.print(" ");}
            for(k=numero/2; k<=(numero/2)+1; k++){
                System.out.print("*");}
            System.out.println("");
        }
    }
}
   