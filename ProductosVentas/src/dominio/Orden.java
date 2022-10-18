/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import dominio.*;
import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public class Orden {
    private int idOrden;
    private ArrayList<Producto> productos = new ArrayList<>();
    private static int contadorOrdenes;
    private static int maxProductos = 10;
    
//    private static int cont;
    
    public Orden() {
        this.idOrden = ++contadorOrdenes;
    }
    
    public void agregarProducto(Producto producto){
        if(maxProductos == 0){
            System.out.println("La lista de productos esta llena");
        }else{
            maxProductos--;
            this.productos.add(producto);
        }
    }
    
    public double calcularTotal(){
        double total=0;
        for (Producto prod : productos) {
            total+=prod.getPrecio() ;
        }
        return total;
    }
    
    public void mostrarOrden(){
        for (Producto prod : productos) {
            System.out.println(idOrden +" "+prod); ;
        }
    }
    
}
