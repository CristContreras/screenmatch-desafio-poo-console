import com.aluracursos.screenmatchdesafio.calculos.Reproductor;
import com.aluracursos.screenmatchdesafio.modelos.Cancion;
import com.aluracursos.screenmatchdesafio.modelos.Podcast;
import com.aluracursos.screenmatchdesafio.modelos.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        Reproductor reproductor = new Reproductor();


        println("Ingrese una opción");
        println("1. Reproducir una canción");
        println("2. Reproducir un podcast");
        println("3. Reproducir un video");
        print("Opcion: ");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                Cancion unaCancion = new Cancion();
                unaCancion.setTitulo("Welcome to the jungle");
                unaCancion.setArtista("Guns and Roses");
                unaCancion.setGenero("Rock");
                unaCancion.setDuracion(3);
                unaCancion.setAñoLanzamiento(2002);
                unaCancion.meGusta();
                reproductor.reproducirElemento(unaCancion);
                println("Volumen: "+reproductor.getVolumen());
                reproductor.subeVolumen();
                break;
            case 2:
                Podcast podcast = new Podcast();
                podcast.setTitulo("Historias Paranormal");
                podcast.setPresentador("Jose Perez");
                podcast.setDuracion(120);
                podcast.setEpisodio(2);
                podcast.meGusta();
                reproductor.reproducirElemento(podcast);
                break;
            case 3:
                Video unVideo = new Video();
                unVideo.setNombreVideo("We are the World");
                unVideo.setDuracion(2);
                unVideo.setCalidad("HD");
                reproductor.reproducirElemento(unVideo);
        }

        teclado.close();
    }

    static void println(String msj){
        System.out.println(msj);
    }
    static void print(String msj){
        System.out.print(msj);
    }
}
