/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4.modulo.pkg2.clase.pkg6.parte.pkg3;

/**
 *
 * @author Jorge Santiago
 */
public class Producto implements Comparable<Producto> {
    public int codigo;
    private String nombre;
    private double precio;
    private String descripcion;
    private int stock;
    private Categorias rubro;

    public Producto(int codigo, String nombre, double precio, String descripcion, int stock, Categorias rubro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categorias getRubro() {
        return rubro;
    }

    public void setRubro(Categorias rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto t) {
     if(codigo == t.codigo){
         return 0;
    }else if (codigo > t.codigo){
        return 1;
    }else {
        return -1;
            }  
}
    
    
}