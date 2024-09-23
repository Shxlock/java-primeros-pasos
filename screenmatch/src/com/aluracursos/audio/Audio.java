package com.aluracursos.audio;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int meGusta;
    private int clasificacion;
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }


    public void meGusta(){
        System.out.println("Te ha gustado "+ this.titulo);
        this.meGusta++;
    }

    public void reproducir(){
        System.out.println("reproduciendo.."+ this.titulo);
        this.totalDeReproducciones++;
    }

    public void seeData(){
        System.out.println("""
                DATA:"""+ " Autor: "+this.autor+ " Nombre: "+ this.titulo+ " Duracion: "+this.duracion + " Autor: "+this.autor);
    }
}
