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
    private int contadorOrdenes;
    private static int maxProductos = 10;
    
    private static int cont;
    
    public Orden() {
        this.contadorOrdenes=++Orden.cont;
    }
    
    public static void agregarProducto(Producto producto){
        while(maxProductos == 0){
            System.out.println("La lista de productos esta llena");
        }
        //ArrayList<Producto> productos = new ArrayList<Producto>();
        maxProductos--;
        this.productos.add(producto);
        //productos[Producto.contadorProducto]=producto;
    }
    
}
