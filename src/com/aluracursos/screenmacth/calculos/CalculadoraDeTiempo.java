package com.aluracursos.screenmacth.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
