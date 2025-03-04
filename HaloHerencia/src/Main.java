public class Main {
    public static void main(String[] args) {
        Spartan2 jefemaestro = new Spartan2("Jonh", 100, "Rifle de asalto", 0);
        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("covenant");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();

        System.out.println("-----------------------------------------------------------------------------");
        Spartan3 jefemaestro_3 = new Spartan3("Denys", 300, "Rifle", 0);
        jefemaestro_3.mostrarInfo();
        jefemaestro_3.camuflajeActivo();
        jefemaestro_3.atacar("covenant");
        jefemaestro_3.recibirDano(80);
        jefemaestro_3.recargarEscudo();
        System.out.println("-----------------------------------------------------------------------------");

        Spartan4 jefemaestro_4 = new Spartan4("Juanito", 200, "Pistola", 0);
        jefemaestro_4.mostrarInfo();
        jefemaestro_4.recargarEscudo();
        jefemaestro_4.atacar("covenant");
        jefemaestro_4.recibirDano(80);
        jefemaestro_4.recargarEscudo();

    }

}