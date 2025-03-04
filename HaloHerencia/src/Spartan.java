public class Spartan extends Soldado{

    private int escudo;

    public Spartan (String nombre, int salud, String arma, int escudo){
        super(nombre, salud, arma);
        this.escudo = escudo;

    }

    public void recargarEscudo(){
        escudo = 100;
        System.out.println("Soldado: " + nombre + " recargo su escudo al maximo");
    }

    @Override
    public void recibirDano(int dano){
        if (salud > 0) {
            escudo -= dano;
            if (salud < 0) {
                salud += escudo;
                escudo = 0;
            }
            System.out.println("Soldado: " + nombre + " recibio daño, Escudera: " + escudo + " Salud: " + salud );

        }else {
            super.recibirDano(dano);
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Escudo: " + this.escudo);
    }
}
