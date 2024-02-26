
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Alquiler {
    private String FechaA, fechaD;
    private String cte;
    private String prod; //producto p[]= new producto[3]; 
    //private ArrayList<producto> ListaProd = new ArryList();


    public Alquiler(String FechaA, String fechaD, String C, String p) {
        this.FechaA = FechaA;
        this.fechaD = fechaD;
        this.cte = C;
        this.prod = p;
    }


    @Override
    public String toString() {
        return "Alquiler{" + "Fecha Alquiler=" + FechaA + 
                "\n fecha Devolución=" + fechaD + "\n cliente=" + cte +
                "\n producto=" + prod;
    }
    
    
    
}
