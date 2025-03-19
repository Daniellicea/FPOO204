import javax.swing.*;
import java.util.Random;

public class generador_matricula {



        private String nombre;
        private String apellidoPaterno;
        private String apellidoMaterno;
        private String anioNacimiento;
        private String carrera;
        private String anioEnCurso;

        public GeneradorMatricula(String nombre, String apellidoPaterno, String apellidoMaterno, String anioNacimiento, String carrera, String anioEnCurso) {
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.anioNacimiento = anioNacimiento;
            this.carrera = carrera;
            this.anioEnCurso = anioEnCurso;
        }

        public String generarMatricula() {
            String primeras3LetrasCarrera = carrera.substring(0, Math.min(3, carrera.length())).toUpperCase();
            String ultimos2DigitosAnioCurso = anioEnCurso.substring(anioEnCurso.length() - 2);
            String ultimos2DigitosAnioNacimiento = anioNacimiento.substring(anioNacimiento.length() - 2);
            String primeraLetraNombre = nombre.substring(0, 1).toUpperCase();
            String tresLetrasApellidoPaterno = apellidoPaterno.substring(0, Math.min(3, apellidoPaterno.length())).toUpperCase();
            String tresLetrasApellidoMaterno = apellidoMaterno.substring(0, Math.min(3, apellidoMaterno.length())).toUpperCase();

            Random rand = new Random();
            int numeroAleatorio = rand.nextInt(900) + 100; // Número aleatorio de 3 dígitos

            return primeras3LetrasCarrera + ultimos2DigitosAnioCurso + ultimos2DigitosAnioNacimiento +
                    primeraLetraNombre + tresLetrasApellidoPaterno + tresLetrasApellidoMaterno + numeroAleatorio;
        }

        public void mostrarMatricula() {
            String matricula = generarMatricula();
            JOptionPane.showMessageDialog(null, "Matrícula generada: " + matricula);
        }
}