package com.aluracursos.audio;

public class Podcast extends Audio{
    private String script;
    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
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
