# ScreenMatch

Aplicación realizada para la inmersión java impartida por Alura Latam.

## Descripción

Esta aplicación esta en desarrollo, su meta es evaluar diversas peliculas directamente interactuando con el usuario, calculando un promedio en base a estas evaluaciones.


## Empezando 🚀

```bash
# paso 1
Correra el programa en la consola.
```

```bash
# paso 2
se le solicitara a 3 usuarios el ingreso de su evaluacion.
```


https://github.com/joselmuziotti/screenmatch-backend-java/assets/133175498/a9e60cc3-7f4b-4671-8ec6-226a00daa3ba


## Desafios ⚙️

Como parte del desafío sugerido por los intructores, se solicito cambiar el bucle FOR por el WHILE.

```bash
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
```

## Construido Con 🛠️

Las tecnologías utilizadas:

- [Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) - Lenguaje de programación.
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/?section=windows) - IDE utilizado.

## Contribuyendo 🖇️

Las contribuciones son lo que hacen a la comunidad de código abierto un lugar increíble para aprender, inspirar y crear. Cualquier contribución que hagas es muy apreciada. 

