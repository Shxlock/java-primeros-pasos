package com.aluracursos.screenmatch.modelos;

public class Titulo {

    String nombre;
    int duracion;
    int fechaLanzamiento;
    boolean incluidoEnElPlan;
    int totalDeLasEvaluaciones;
    double sumaDeLasEvaluaciones;

    public String getNombre(){
        return this.nombre;
    }

    public int getFechaLanzamiento(){
        return this.fechaLanzamiento;
    }

    public int getDuracionEnMinutos(){
        return this.duracion;
    }

    public int getTotalDeLasEvaluaciones(){
        return this.totalDeLasEvaluaciones;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fecha){
        this.fechaLanzamiento = fecha;
    }

    public void setDuracionEnMinutos(int duracion){
        this.duracion = duracion;
    }

    public void setIncluidoEnElPlan(boolean incluido){
        this.incluidoEnElPlan = incluido;
    }

    public void muestraDatos(){
        String resultado = String.format("\n Datos de la pelicula \n pelicula:  %s  \n duracion: %d \n fecha lanzamiento: %s \n includio en el plan: %s",
                nombre,
                getDuracionEnMinutos(),
                fechaLanzamiento,
                incluidoEnElPlan ? "Si": "No");

        System.out.println(resultado);

    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    public double calcularMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }



}
