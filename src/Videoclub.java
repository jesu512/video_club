/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO MAIN
 */
public class Videoclub {
    public static String titulo;
    public static int precio, dias;
    static Scanner lea= new Scanner(System.in);
    
    static void llenarP(){
        System.out.println("nombre del producto");
        titulo=lea.next();
        System.out.println("precio alquiler");
        precio=lea.nextInt();
        System.out.println("dias de alquiler");
        dias=lea.nextInt();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pelicula p= null;
        videojuego vj= null;
        cliente c= null;
        Alquiler alq=null;
        ArrayList<pelicula> ListaP = new ArrayList();
        ArrayList<videojuego> Listavj= new ArrayList();
        ArrayList<Alquiler> ListaAlq = new ArrayList();
        ArrayList<cliente> ListaC = new ArrayList();
        String genero, anno, director, actores, estilo, plataforma, id, nombre = null, fechaA, devolucion;
        int opc, importe=0;
        
        do{
            System.out.println("\n1. Agregar Peliculas"
                    + "\n2. Agregar video juegos"
                    + "\n3. lista peliculas"
                    + "\n4. lista video juegos"
                    + "\n5. consultar producto"
                    + "\n6. Agregar cliente"
                    + "\n7. ver cliente"
                    + "\n8. Alquilar"
                    + "\n9. ver productos alquilados"
                    + "\n10. salir ");
            opc=lea.nextInt();
            
            switch (opc){
                case 1: 
                    llenarP();
                    System.out.println("genero");
                    genero=lea.next();
                    System.out.println("año estreno");
                    anno=lea.next();
                    System.out.println("actores");
                    actores=lea.next();
                    System.out.println("directores");
                    director=lea.next();
                    p=new pelicula(genero, anno, director, actores, titulo, precio, dias);
                    ListaP.add(p);
                    break;
                case 2: llenarP();
                System.out.println("estilo:");
                estilo=lea.next();
                System.out.println("plataforma");
                plataforma=lea.next();
                vj= new videojuego(estilo, plataforma, titulo, precio, dias);
                Listavj.add(vj);
                break;
                
                case 3: 
                    for (pelicula p1: ListaP)
                        System.out.println(p1.toString());
                    break;
                case 4: 
                    for (videojuego v: Listavj)
                        System.out.println(v.toString());
                    break;
                case 5:
                    System.out.println("titulo del producto");
                    titulo=lea.next();
                    for (pelicula p1: ListaP){
                        if (p1.getTitulo().equalsIgnoreCase(titulo))
                            System.out.println(p1.toString());
                    }
                    for (videojuego v: Listavj){
                        if (v.getTitulo().equalsIgnoreCase(titulo))
                            System.out.println(v.toString());
                    }
                    break;
                case 6:
                     System.out.println("nombre del cliente");
                     nombre=lea.next();
                     System.out.println("id del cliente");
                     id=lea.next();
                     c= new cliente(id,nombre);
                     ListaC.add(c);
                     break;
                case 8:
                    System.out.println("fecha de alquiler");
                    fechaA=lea.next();
                    System.out.println("fecha de devolucion");
                    devolucion=lea.next();
                    System.out.println("cliente");
                    id=lea.next();
                    
                    for (cliente e: ListaC)
                        if (e.getCc().equals(id))
                            nombre=e.getNombre();
                    
                    System.out.println("nombre del producto");
                    titulo=lea.next();
                    for (pelicula p1: ListaP){
                        if (p1.getTitulo().equalsIgnoreCase(titulo)){
                            titulo=p1.getTitulo();
                            p1.setAlquilado("si");
                            importe=p1.getPrecio();
                        }
                    }
                    
                    for (videojuego v: Listavj){
                        if (v.getTitulo().equalsIgnoreCase(titulo)){
                            titulo=v.getTitulo();
                            v.setAlquilado("si");
                            importe=v.getPrecio();
                        }
                    }
                                    
                    alq= new Alquiler(fechaA,devolucion,nombre, titulo);
                    ListaAlq.add(alq);
                        System.err.println("valor del alquiler: "+importe);
                        break;
                
                        case 7: 
                        for (Alquiler a1: ListaAlq)
                            System.out.println(a1.toString());
                        break;
                        case 9:
                             for (pelicula p1: ListaP){
                                 if(p1.alquilado.equalsIgnoreCase("si"))
                                     System.out.println(p1.getTitulo());
                             }
                              for (videojuego v: Listavj){
                                  if(v.getAlquilado().equalsIgnoreCase("si"))
                                      System.out.println(v.getTitulo());
                              }
                    break;
                    
            }
        }while(opc!= 10);
        
        
    }
    
}
