package com.aluracursos.screenmatchdesafio.modelos;

public class Podcast extends Audio {
    private String Presentador;
    private int Episodio;

    @Override
    public void reproducir(){
        super.reproducir();
        System.out.println("Presentador: "+getPresentador());
        System.out.println("Episodio: "+getEpisodio());

    }

    public String getPresentador() {
        return Presentador;
    }

    public void setPresentador(String presentador) {
        Presentador = presentador;
    }

    public int getEpisodio() {
        return Episodio;
    }

    public void setEpisodio(int episodio) {
        Episodio = episodio;
    }
}
