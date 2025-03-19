import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String Nombre = (JOptionPane.showInputDialog(null,"Ingrese el nombre:"));
        String Ape_pa = (JOptionPane.showInputDialog(null,"Ingrese el apellido paterno"));
        String Ape_ma = (JOptionPane.showInputDialog(null,"Ingrese el apellido materno"));
        String anio = (JOptionPane.showInputDialog(null,"Ingrese el año de nacimiento:"));
        String anio_en_curso = (JOptionPane.showInputDialog(null,"Ingrese el año en curso:"));
        String carrera = (JOptionPane.showInputDialog(null,"Ingrese el carrera:"));


        generador_matricula generador = new generador_matricula(Nombre,Ape_pa ,Ape_ma , anio, carrera, anio_en_curso);
        generador.generarMatricula();
    }
}

