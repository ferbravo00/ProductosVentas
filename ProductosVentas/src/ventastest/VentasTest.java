/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventastest;
import dominio.*;
import com.datos.acceso.*;
/**
 *
 * @author Alumno Mañana
 */
public class VentasTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orden o1 = new Orden ();
        Orden o2 = new Orden ();
        Orden o3 = new Orden ();
        Producto p1 = new Producto("Patata", 2);
        Producto p2 = new Producto("Cafe", 1.5);
        Producto p3 = new Producto("Soja", 0.4);
        Producto p4 = new Producto("Patata", 2);
        Producto p5 = new Producto("Cafe", 1.5);
        Producto p6 = new Producto("Soja", 0.6);
        Producto p7 = new Producto("Patata", 2);
        Producto p8 = new Producto("Cafe", 1.5);
        Producto p9 = new Producto("Soja", 0.25);
        Producto p10 = new Producto("Patata", 2);
        Producto p11 = new Producto("Cafe", 1.5);
        
        o1.agregarProducto(p1);
        o1.agregarProducto(p2);
        o1.agregarProducto(p3);
        o1.agregarProducto(p4);
        o1.agregarProducto(p5);
        o1.agregarProducto(p6);
        o1.agregarProducto(p7);
        o1.agregarProducto(p8);
        o1.agregarProducto(p9);
        o1.agregarProducto(p10);
        o1.agregarProducto(p11);
        
        
        o2.agregarProducto(p1);
        o2.agregarProducto(p2);
        o2.agregarProducto(p3);
        o2.agregarProducto(p4);
        
        
        o3.agregarProducto(p5);
        
        
        
        
        o1.mostrarOrden();
        o2.mostrarOrden();
        o3.mostrarOrden();
        
        System.out.println("");
        System.out.println("PRECIO TOTAL DEL ORDEN 1: "+o1.calcularTotal()+"€");
        System.out.println("");
        System.out.println("PRECIO TOTAL DEL ORDEN 2: "+o2.calcularTotal()+"€");
        System.out.println("");
        System.out.println("PRECIO TOTAL DEL ORDEN 3: "+o3.calcularTotal()+"€");
        
        
        IImplementacion.leer("nombre");
        
    }
    
}
