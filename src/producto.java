/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class producto {
    protected  String titulo, alquilado;
    protected int precio, dias;

    public producto(String titulo, int precio, int dias) {
        this.titulo = titulo;
        this.alquilado = "no";
        this.precio = precio;
        this.dias = dias;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAlquilado() {
        return alquilado;
    }

    public int getPrecio() {
        return precio;
    }

    public int getDias() {
        return dias;
    }

    public void setAlquilado(String alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return  "\ntitulo=" + titulo + "\n alquilado=" + alquilado + "\n precio=" + precio + "\n dias=" + dias ;
    }
    

    
    
}
