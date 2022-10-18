/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import dominio.*;
/**
 *
 * @author Alumno Mañana
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    
    private static int contadorProducto;
    
//    private static int cont;

    public Producto(String nombre, double precio) {
        this.idProducto = ++contadorProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
        this.idProducto = ++contadorProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getContadorProducto() {
        return contadorProducto;
    }

    public void setContadorProducto(int contadorProducto) {
        this.contadorProducto = contadorProducto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.idProducto;
        hash = 41 * hash + this.contadorProducto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (this.contadorProducto != other.contadorProducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{idProducto= ").append(idProducto);
        sb.append(", nombre= ").append(nombre);
        sb.append(", precio= ").append(precio+"€");
        sb.append('}');
        return sb.toString();
    }
    
    
}
