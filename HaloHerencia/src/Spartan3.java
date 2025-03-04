public class Spartan3 extends  Spartan {

    public Spartan3(String nombre, int salud, String arma, int escudo) {
        super(nombre, salud, arma, 80);
    }

    public void camuflajeActivo(){
        System.out.println("El espartan" + nombre + " cuenta con camuflaje activo para invisibilidad");
    }
}