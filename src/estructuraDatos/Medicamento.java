/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

/**
 * *Esta clase hereda de Producto, por tanto todos sus atributos y añadimos otros los cuales cuenta con sus Getter y Setter y su contructor
 * @author juanc
 */
public class Medicamento extends Producto {
    private String comoTomar;
    private String efectosAdversos;
    private TipoMedicamento tipo;

    public Medicamento(String codigo, String nombre, String descripcion, double precio, int unidades, TipoMedicamento tipo ,String comoTomar, String efectosAdversos) {
        super(codigo, nombre, descripcion, precio, unidades);
        this.comoTomar = comoTomar;
        this.efectosAdversos = efectosAdversos;
        this.tipo = tipo; 
    }

    public String getComoTomar() {
        return comoTomar;
    }

    public void setComoTomar(String comoTomar) {
        this.comoTomar = comoTomar;
    }

    public String getEfectosAdversos() {
        return efectosAdversos;
    }

    public void setEfectosAdversos(String efectosAdversos) {
        this.efectosAdversos = efectosAdversos;
    }

    public TipoMedicamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoMedicamento tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Medicamento: "+  super.toString() + " Tipo = " + tipo + "\n" + " Como Tomar = " + comoTomar +  "\n Efectos Adversos = " + efectosAdversos  ;
    }
    
    
}
