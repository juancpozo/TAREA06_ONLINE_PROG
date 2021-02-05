/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

/**
 * Esta clase define los atributos, el constructor, los GET y SET y el metodo ToStrign del objeto Cliente
 * @author juanc
 * @version 1.0
 * 
 */
public class Cliente {
    
    private String id;
    private String nombre;
    private String direccion;
    private String telefono;
    private boolean baja;

   
    public Cliente(String id, String nombre, String direccion, String telefono){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.baja = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }
    
    @Override
    public String toString() {
        return "Cliente: " + "\n Identificador = " + id + "\n Nombre = " + nombre + "\n Direccion = " + direccion + "\n Telefono = " + telefono + "\n";
    }

}
