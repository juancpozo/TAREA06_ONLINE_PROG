/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

/**
 * Esta clase define los atributos, el constructor, los GET y SET y el metodo ToStrign del objeto Producto así como los metodos anadirUnidades y quitarUnidades *
 * Actualización - Clase cambiada a abstracta
 * @author juanc
 * @version 1.0
 * 
 */
public abstract class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int unidades;
    private boolean baja;

    public Producto(String codigo, String nombre, String descripcion, double precio, int unidades) {
        //Comprueba codigo
        if (comprobarCodigo(codigo)) {
            this.codigo = codigo;
        }else{
            this.codigo = "X";
        }
        //Comprueba que el precio es mayor a 0
        if (precio > 0) {
            this.precio = precio;
        }else{
            this.precio = 0;
        }
        //Comprueba que las unidades es mayor que 0
        if (unidades > 0) {
            this.unidades = unidades;
        }else{
            this.unidades = 0;
        }
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.baja = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (comprobarCodigo(codigo)) {
            this.codigo = codigo;
        }else{
            System.out.println("Codigo no valido, por tanto no modificado");;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }else{
            System.out.println("No se puede designar un precio negativo a un producto");
        }
    }

    public int getUnidades() {
        return unidades;
    }
    
    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }
    
    
    public static boolean comprobarCodigo(String codigo){
        boolean devolucion;
        devolucion = codigo.matches("^[0-9]{13}$");
        return devolucion;
    }
    
    public boolean anadirUnidades(int unidades){
        boolean dev = false;
        
        if (unidades > 0) {
            this.unidades = this.unidades + unidades;
            dev = true;
        }else{
            dev = false;
            System.out.println(" No se pueden añadir menos unidades");
        }
        return dev; 
    }
    
    public boolean quitarUnidades(int unidades){
        boolean devolucion = false;
        
        if (unidades > 0 && this.unidades >= unidades) {
            this.unidades = this.unidades - unidades;
        }else{
            devolucion = false;
            System.out.println("Unidades a quitar no pueden superar las unidades guardadas");
        }
    
        return devolucion;
    }
    
     @Override
    public String toString() {
        return "\n Codigo = " + codigo + "\n Nombre = " + nombre + "\n Descripcion = " + descripcion + "\n Precio = " + precio + "\n Unidades: " + unidades + "\n";
    }
    
}
