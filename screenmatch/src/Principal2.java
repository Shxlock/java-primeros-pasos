import com.aluracursos.audio.Audio;
import com.aluracursos.audio.Podcast;
import com.aluracursos.audio.Canciones;
import com.aluracursos.audio.Clasificable;
import com.aluracursos.screenmatch.modelos.Pelicula;


public class Principal2 {
    public static void main(String[] args) {

        System.out.println("Bienvenido a mi programa");

        Canciones cancion = new Canciones();
        cancion.setTitulo("DELRESTO");
        cancion.setLyrics("aaaaaaaaaaaa");
        cancion.setAutor("Travis Scott and Beyoncé");
        cancion.setDuracion(4);
        cancion.setMeGusta(100);
        cancion.setTotalDeReproducciones(1000);

        System.out.println(cancion.getMeGusta());
        cancion.meGusta();
        System.out.println(cancion.getMeGusta());
        cancion.reproducir();

        cancion.seeData();
        if(cancion.getClasificacion() == 4){
            System.out.println("Esta cancion está de rigurosa moda!");
        }else if(cancion.getClasificacion() == 2){
            System.out.println("No está mal, pero es mid");
        }else{
            System.out.println("basurilla");
        }




        Podcast podcast = new Podcast();
        podcast.setAutor("John Connor");
        podcast.setDuracion(123);
        podcast.setTitulo("This is connor's podcast");
        podcast.setMeGusta(3);
        podcast.setScript("hi guys this is connor...");
        podcast.reproducir();
        podcast.seeData();

        if(podcast.getClasificacion() == 4){
            System.out.println("Este podcast está de rigurosa moda!");
        }else if(podcast.getClasificacion() == 2){
            System.out.println("No está mal, pero es mid");
        }else{
            System.out.println("basurilla");
        }

    }


}
