package modelo;

public class Titulo {
    private String nombre;
    private int fechaDeEstreno;
    private int duracionEnMinutos;
    private String sinopsis;
//    private double puntuacion;
//    private boolean planBasico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeEstreno() {
        return fechaDeEstreno;
    }

    public void setFechaDeEstreno(int fechaDeEstreno) {
        this.fechaDeEstreno = fechaDeEstreno;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

//    public double getPuntuacion() {
//        return puntuacion;
//    }

//    public boolean isPlanBasico() {
//        return planBasico;
//    }
//
//    public void setPlanBasico(boolean planBasico) {
//        this.planBasico = planBasico;
//    }

    public void mostrarFichaTecnica(){
        System.out.println("<--Ficha Técnica-->");
        System.out.println("Title: " + nombre);
        System.out.println("Fecha de Estreno: " + fechaDeEstreno +".");
        System.out.println("Duración: " + getDuracionEnMinutos() + "min.");
        System.out.println("Sinopsis: " + sinopsis);
//        System.out.println("Puntuación: " + getPuntuacion() + "/5");
//        System.out.println("Incluida en el plan básico: " + planBasico);
    }
}
