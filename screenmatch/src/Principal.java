import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Pulp Fiction");
        miPelicula.setFechaLanzamiento(1994);
        miPelicula.setDuracionEnMinutos(159);
        miPelicula.setIncluidoEnElPlan(true);


        miPelicula.muestraDatos();

        miPelicula.evalua(2);
        miPelicula.evalua(4.3);
        miPelicula.evalua(4.0);

        double media = miPelicula.calcularMedia();
        System.out.println(String.format(" La media es: %.2f", media ));

        Serie casaDragon = new Serie();
        casaDragon.setNombre("Casa dragon");
        casaDragon.setTemporadas(4);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodio(55);
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setIncluidoEnElPlan(true);
        System.out.println(casaDragon.getNombre() + " tiene una duracion de: "+casaDragon.getDuracionEnMinutos()+ " minutos");
        casaDragon.muestraDatos();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        System.out.println(calculadora.getTiempoTotal());

        calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);



        filtroRecomendaciones.filtra(episodio);





    }

}
