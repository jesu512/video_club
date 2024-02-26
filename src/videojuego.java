/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class videojuego extends producto{
 private String estilo, plataforma;

    public videojuego(String estilo, String plataforma, String titulo, int precio, int dias) {
        super(titulo, precio, dias);
        this.estilo = estilo;
        this.plataforma = plataforma;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public String toString() {
        return "videojuego{"+ super.toString() + "estilo=" + estilo + ", plataforma=" + plataforma;
    }
 
 
}
