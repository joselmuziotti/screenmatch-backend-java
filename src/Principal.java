import modelo.Movies;
import modelo.Series;

import java.util.Scanner;

public class Principal {
    public void mostrarMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while(opcion != 9){
            String menu = """
                    Bienvenido(a) a ScreenMatch.
                    1) Ingresa Nueva Película.
                    2) Ingresa Nueva Serie.
                    
                    9) Salir.
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Título:");
                    String nombre = teclado.nextLine();
                    System.out.println("Fecha de estreno:");
                    int fechaDeEstreno = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Duración en minutos:");
                    int duracionPelicula = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Sinopsis:");
                    String sinopsis = teclado.nextLine();
                    Movies peliculaUsuario = new Movies();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeEstreno(fechaDeEstreno);
                    peliculaUsuario.setDuracionEnMinutos(duracionPelicula);
                    peliculaUsuario.setSinopsis(sinopsis);
                    peliculaUsuario.mostrarFichaTecnica();
                    break;

                case 2:
                    System.out.println("Título:");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Fecha de estreno:");
                    int fechaDeEstrenoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Temporadas:");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Episodios totales:");
                    int numeroEpisodios = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Duración por episodio:");
                    int duracionEpisodio = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Sinopsis:");
                    String sinopsisSerie = teclado.nextLine();
                    Series serieUsuario = new Series();
                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeEstreno(fechaDeEstrenoSerie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodios(numeroEpisodios);
                    serieUsuario.setDuracionEpisodio(duracionEpisodio);
                    serieUsuario.setSinopsis(sinopsisSerie);
                    serieUsuario.mostrarFichaTecnica();
                    break;

                case 9:
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }
}
