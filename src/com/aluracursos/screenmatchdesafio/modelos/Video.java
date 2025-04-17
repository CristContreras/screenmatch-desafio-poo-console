package com.aluracursos.screenmatchdesafio.modelos;

import com.aluracursos.screenmatchdesafio.calculos.Reproducible;

public class Video implements Reproducible {

    private String nombreVideo;
    private int duracion;
    private String calidad;

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo Video: "+ getNombreVideo());
        System.out.println("Duracion: "+getDuracion());
        System.out.println("Calidad: "+getCalidad());
    }

    public void setNombreVideo(String nombreVideo){
        this.nombreVideo=nombreVideo;
    }
    public String getNombreVideo(){
        return nombreVideo;
    }
    public int getDuracion(){
        return duracion;
    }

    public void setDuracion(int duracion){
        this.duracion=duracion;
    }

    public String getCalidad(){
        return calidad;
    }
    public void setCalidad(String calidad){
        this.calidad=calidad;
    }


}
