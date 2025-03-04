public class Spartan4 extends Spartan {
    public Spartan4(String nombre, int salud, String arma, int escudo) {
        super(nombre, salud, arma, 100);
    }

    public void usaPropulsores(){
        System.out.println("El espartan" + nombre + " usa propulsores para mmoverse rapidamente");
    }
}