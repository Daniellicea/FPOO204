public class Main {
    public static void main(String[] args) {
        Spartan2 jefemaestro = new Spartan2("Jonh", 100, "Rifle de asalto", 0);
        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("covenant");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();
    }

}