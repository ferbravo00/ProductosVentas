/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import com.datos.acceso.IImplementacion;
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
    
//    public void agregarProducto(Producto producto){
//        if(maxProductos == 0){
//            System.out.println("La lista de productos esta llena");
//        }else{
//            maxProductos--;
//            this.productos.add(producto);
//        }
//    }
    
    
    public void agregarProducto(Producto producto){     //con este codigo se pueden poner mas ordenes 
        if(productos.size()>=maxProductos){             //si pongo productos.getIdProducto() no puedo repetir ID
            System.out.println("La lista de productos de la ORDEN "+idOrden+" esta llena");
        }else{
            this.productos.add(producto);
            IImplementacion.agregar("nombre",producto.getNombre());
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
        if(productos.size()>1){
            System.out.println("");
            System.out.println("Hay "+productos.size()+" productos en la ORDEN "+idOrden);
        }else if(productos.size()==1){
            System.out.println("");
            System.out.println("Hay 1 producto en la ORDEN "+idOrden);
        }else{
            System.out.println("");
            System.out.println("NO hay producto en la ORDEN "+idOrden);
        }
        for (Producto prod : productos) {
            System.out.println(idOrden +" "+prod); 
        }
    }
    
}
