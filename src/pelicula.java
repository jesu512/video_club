/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class pelicula  extends producto{
    private String genero, anno, director, actores;

    public pelicula(String genero, String anno, String director, String actores, String titulo, int precio, int dias) {
        super(titulo, precio, dias);
        this.genero = genero;
        this.anno = anno;
        this.director = director;
        this.actores = actores;
    }

    public String getGenero() {
        return genero;
    }

    public String getAnno() {
        return anno;
    }

    public String getDirector() {
        return director;
    }

    public String getActores() {
        return actores;
    }

    @Override //sobreescritura
    public String toString() {
        return "pelicula{"+ super.toString()+ "genero=" + genero + "\n anno=" + anno + "\n director=" + director + "\n actores=" + actores;
    }
    
    
    
}
