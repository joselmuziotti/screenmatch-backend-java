import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //System.out.println("Película Matrix");

        //Declaracion de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        double evaluacionUsuario = 0;
        double i = 0;

        System.out.println("Película: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Evaluación Promedio: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2024){
            System.out.println("Película Actual");
        } else {
            System.out.println("Película Retro Popular");
        }

        /*for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Evalúa la película");
            double evaluacionPelicula = teclado.nextDouble();
            evaluacionUsuario = evaluacionUsuario + evaluacionPelicula;
        }
        System.out.println("Evaluación promedio: " + evaluacionUsuario / 3);*/

        while (i < 3){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Evalúa la pelicula");
            double evaluacionPelicula = teclado.nextDouble();
            evaluacionUsuario = evaluacionUsuario + evaluacionPelicula;
            i++;
        }
        System.out.println("Evaluación promedio: " + evaluacionUsuario / 3);
    }
}