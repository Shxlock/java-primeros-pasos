package com.aluracursos.audio;
import com.aluracursos.audio.Clasificable;

public class Canciones extends Audio{

    private String lyrics;

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    @Override
    public int getClasificacion() {
        if(this.getTotalDeReproducciones() > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
