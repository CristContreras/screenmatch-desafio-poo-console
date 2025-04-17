package com.aluracursos.screenmatchdesafio.calculos;

public class Reproductor {
    private int volumen=50;
    public void reproducirElemento(Reproducible reproducible){
        reproducible.reproducir();

    }

    public void subeVolumen(){
        if(volumen<100) volumen+=10;
        System.out.println("Volumen subido a: "+getVolumen());
    }

    public int getVolumen(){
        return volumen;
    }
}
