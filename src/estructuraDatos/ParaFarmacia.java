/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

/**
 *Esta clase hereda de Producto, por tanto todos sus atributos y añadimos otros los cuales cuenta con sus Getter y Setter y su contructor
 * @version 1.0
 * @author juanc
 */
public class ParaFarmacia extends Producto {
    
    private int dosisUnidades;
    private double descuento;
    private Categoria cat;

    public ParaFarmacia(String codigo, String nombre, String descripcion, double precio, int unidades, Categoria cat, int dosisUnidades, double descuento ) {
        super(codigo, nombre, descripcion, precio, unidades);
        this.dosisUnidades = dosisUnidades;
        this.descuento = descuento;
        this.cat = cat;
    }

  
    public int getDosisUnidades() {
        return dosisUnidades;
    }

    public void setDosisUnidades(int dosisUnidades) {
        this.dosisUnidades = dosisUnidades;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }
    
    @Override
    public String toString() {
        return "ParaFarmacia: " + super.toString() +  " Categoria = " + cat + "\n" + " Dosis Unidades = " + dosisUnidades + " \n Descuento = " + descuento ;
    }
    
}
