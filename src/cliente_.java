/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class cliente {
    private String cc, nombre;

    public cliente(String cc, String nombre) {
        this.cc = cc;
        this.nombre = nombre;
    }

    public String getCc() {
        return cc;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "cliente{" + "cc=" + cc + ", nombre=" + nombre + '}';
    }
    
    
    
}
