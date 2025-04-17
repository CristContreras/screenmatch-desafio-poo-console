package com.aluracursos.screenmatchdesafio.modelos;

public class Cancion extends Audio {
    private String Artista;
    private int AñoLanzamiento;
    private String Genero;

    //Agregar clase Video para implementar una interfaz?
    @Override
    public void reproducir(){
        super.reproducir();
        System.out.println("Artista: "+getArtista());
        System.out.println("Genero: "+getGenero());
        System.out.println("Año lanzamiento: "+getAñoLanzamiento());
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public int getAñoLanzamiento() {
        return AñoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        AñoLanzamiento = añoLanzamiento;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
