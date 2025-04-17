package com.aluracursos.screenmatchdesafio.modelos;

import com.aluracursos.screenmatchdesafio.calculos.Reproducible;

public abstract class Audio implements Reproducible {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int meGusta;
    private int clasificacion;

    public void meGusta(){
        this.meGusta++;
    }
    public void reproducir(){
        System.out.println("Reproduciendo");
        System.out.println("Titulo: "+titulo);
        this.totalDeReproducciones+=1;
        System.out.println("Total de reproducciones: "+getTotalDeReproducciones());
        System.out.println("Cantidad de me gusta: "+getMeGusta());
    }

    public String getTitulo() {
        return this.titulo;
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


    public int getMeGusta() {
        return meGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
