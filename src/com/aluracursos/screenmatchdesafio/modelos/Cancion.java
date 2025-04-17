package com.aluracursos.screenmatchdesafio.modelos;

public class Cancion extends Audio {
    private String Artista;
    private int AnioLanzamiento;
    private String Genero;

    //Agregar clase Video para implementar una interfaz?
    @Override
    public void reproducir(){
        super.reproducir();
        System.out.println("Artista: "+getArtista());
        System.out.println("Genero: "+getGenero());
        System.out.println("Año lanzamiento: "+ getAnioLanzamiento());
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public int getAnioLanzamiento() {
        return AnioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        AnioLanzamiento = anioLanzamiento;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
