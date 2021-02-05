/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import estructuraDatos.Categoria;
import estructuraDatos.Cliente;
import estructuraDatos.Medicamento;
import estructuraDatos.ParaFarmacia;
import estructuraDatos.Producto;
import estructuraDatos.TipoMedicamento;
import utilidades.IO_ES;
import utilidades.ValidarDatos;

/**
 * Esta clase contiene el metodo main desde el cual se ejecutará nuestra aplicación, asi como todos los metodos necesarios para manipular los objetos Cliente y Producto
 * Actualizacion - Editamos los metodos para poder usar los nuevos tipos Medicamentos y Parafarmacia
 * @author juanc
 * @version 1.0
 * 
 */
public class CPrincipal {
       final static int TCLIENTE = 50;
       final static int TPROD = 40;
       public static int numClientes = 2;
       public static int numProductos = 4;
       public static Cliente[] arrayCliente = new Cliente[TCLIENTE];
       public static Producto[] arrayProducto = new Producto [TPROD];
     
    public static void main(String[] args) {
        boolean bandera = false;
        int menu;
        CPrincipal.clienteDefecto();
        CPrincipal.productoDefecto();
     
        do {
            System.out.println("-------- LA BOTICA --------");
            System.out.println("CLIENTE");
            System.out.println("1. Añadir Cliente");
            System.out.println("2. Eliminar cliente");
            System.out.println("3. Modificar cliente");
            System.out.println("4. Listar clientes");
            System.out.println("---------------------------");
            System.out.println("PRODUCTO");
            System.out.println("5. Añadir producto");
            System.out.println("6. Eliminar producto");
            System.out.println("7. Modificar producto");
            System.out.println("8. Añadir unidades");
            System.out.println("9. Quitar unidades");
            System.out.println("10. Listar productos");
            //System.out.println("---------------------------");
            //System.out.println("11. Limpiar consola(*Opción para cmd o terminal)");
            System.out.println("---------------------------");
            System.out.println("0. Salir");
            
            menu = utilidades.IO_ES.leerInteger("Introduce una opción del menu", 0, 10);
            switch (menu) {
                case 0:
                    bandera = true;
                    break;
                case 1:
                    anadirCliente();
                    break;
                case 2:
                    eliminarCliente();
                    break;
                case 3:
                    modificarCliente();
                    break;
                case 4:
                    listarClientes();
                    break;
                case 5:
                    anadirProducto();
                    break;
                case 6:
                    eliminarProducto();
                    break;
                case 7:
                    modificarProducto();
                    break;
                case 8:
                    anadirUnidades();
                    break;
                case 9:
                    quitarUnidades();
                    break;
                case 10:
                    listarProductos();
                    break;
                case 11:
                    limpiarConsola();
                    break;    
            }   
        } while (!bandera);
    }
   
    //Metodos para crear Clientes y Productos por defecto al inciar
    public static void clienteDefecto(){
        arrayCliente [0] = new Cliente ("12345678z", "Carlos", "Calle Falsa, 123", "900909090");
        arrayCliente [1] = new Cliente ("00000022E", "Pepe" , "Avenida Libro, 1", "800808080");
    }
    
    public static void productoDefecto(){
        arrayProducto [0] = new Medicamento ("12345678", "Aspirina Bayern", "Analgesico oral", 1.2, 10, TipoMedicamento.ANALGESICO, "Tomar con agua si es necesario para tragar", "Riesgo de hemorragias o hematomas");
        arrayProducto [1] = new Medicamento ("0000000000123", "Algidol Cinfa", "Antiinflamatorio efervescente", 2.0, 5, TipoMedicamento.ANALGESICO, "Diluir en agua y tomar", "Efectos adversos");
        arrayProducto [2] = new ParaFarmacia ("0000000004569", "Gel hidroalcoholico", "Desinfectante de manos", 1.50, 7, Categoria.GELES, 20, 0.1);
        arrayProducto [3] = new ParaFarmacia ("0000000001276", "Mascarilla FFP2 (*BAJA)", "Mascarilla FFP2 Homologada", 1.75, 0, Categoria.MASCARILLAS, 1, 0.1);
        arrayProducto [3].setBaja(true);
    }
    
//Metdodos referentes a Clientes
    public static void anadirCliente(){
        System.out.println("AÑADIR CLIENTE - Num: " + numClientes);
        String id = IO_ES.leerCadena("Introduce el Nif del cliente",9);
        
        if (utilidades.ValidarDatos.validarNif(id)) {
            String nombre = IO_ES.leerCadena("Introduce el nombre del cliente");
            String direccion = IO_ES.leerCadena("Introduce direccion del cliente");
            String telefono = IO_ES.leerCadena("Introduce el telefono del cliente",9);
            
            arrayCliente[numClientes] = new Cliente(id, nombre, direccion, telefono);
            //System.out.println(arrayCliente[numClientes].toString());
            numClientes++;
            System.out.println("Cliente nuevo añadido");
        }else{
            System.out.println("Nif no valido");
        } 
    }
    
    public static void eliminarCliente(){
        for (int i = 0; i < numClientes; i++) {
                System.out.println("Indice clientes: " + i + " -> " + arrayCliente[i].getNombre() + " - DNI: " + arrayCliente[i].getId());
            }
        int indice = IO_ES.leerInteger("Introduce el cliente a eliminar(indice)", 0, numClientes);
        String borrado = arrayCliente[indice].getNombre() + "(*BAJA)";
        
        boolean confirm = IO_ES.leerBooleano("¿Seguro que deseas elminar Cliente(SI o NO)?");
        if (confirm) {
            arrayCliente[indice].setNombre(borrado);
            arrayCliente[indice].setBaja(true);
            System.out.println("Cliente dado de Baja");
        }else{
            System.out.println("Cliente no dado de Baja");
        }      
    }
    
    public static void modificarCliente(){
        for (int i = 0; i < numClientes; i++) {
                System.out.println("Indice clientes: " + i + " -> " + arrayCliente[i].getNombre() + " - NIF: " + arrayCliente[i].getId());
            }
            int indice = IO_ES.leerInteger("Introduce el cliente a modificar(indice)", 0, numClientes);
            int opcion = IO_ES.leerInteger("Opcion a modificar : \n 1. NIF \n 2. Nombre \n 3. Direccion \n 4. Telefono", 0, 4);

            switch (opcion) {
                case 1:
                    String id = IO_ES.leerCadena("Introduce el nuevo NIF");
                    if (utilidades.ValidarDatos.validarNif(id)) {
                      arrayCliente[indice].setId(id);
                        System.out.println("Nif modificado");
                    }else{
                        System.out.println("No se puede modificar el nif por que no es correcto");
                    } 
                    break;
                case 2:
                    String nombre = IO_ES.leerCadena("Introduce el nuevo nombre");
                    arrayCliente[indice].setNombre(nombre);
                    System.out.println("Nombre modificado");
                    break;
                case 3:
                    String direccion = IO_ES.leerCadena("Introduce la nueva direccion");
                    arrayCliente[indice].setDireccion(direccion);
                    System.out.println("Direccion modificada");
                    break;
                case 4:
                    String telefono = IO_ES.leerCadena("Introduce el nuevo telefono",9);
                    arrayCliente[indice].setTelefono(telefono);
                    System.out.println("Telefono modificado");
                    break;          
            }
    }
    
    public static void listarClientes(){
        int opcion = IO_ES.leerInteger("Selecciona una opcion: \n 0. Lista Clientes \n 1. Lista Clientes (Bajas)", 0, 1);
        
        switch (opcion) {
            case 0:
                for (int i = 0; i < numClientes; i++) {
                    if (!arrayCliente[i].isBaja() ) {
                        System.out.println(arrayCliente [i].toString());
                    }
                }
                break;
            case 1:
                for (int i = 0; i < numClientes; i++) {
                    if (arrayCliente[i].isBaja() ) {
                        System.out.println(arrayCliente [i].toString());
                    }
                }
                break;
        }
    }
    
//Metodos referentes a Productos
    public static void anadirProducto(){
        
       int opcion = IO_ES.leerInteger("Selecciona el tipo de proudcto a añadir: \n 0. Medicamento \n 1. Parafarmacia", 0, 2);
        switch (opcion) {
            case 0:
                TipoMedicamento tipo = TipoMedicamento.ANALGESICO;
                System.out.println("AÑADIR MEDICAMENTO");
                String codigo = IO_ES.leerCadena("Introduce el codigo de producto (Medicamento)");
                String nombre = IO_ES.leerCadena("Introduce el nombre del  (Medicamento)");
                String desc = IO_ES.leerCadena("Introduce la descripcion del producto (Medicamento)");
                double precio = IO_ES.leerRealLargo("Introduce el precio del producto (Medicamento)");
                int cant = IO_ES.leerInteger("Introduce la cantidad de productos que tenemos (Medicamento)");
                int opcionTipoMed = IO_ES.leerInteger("Introduce el tipo de medicamento:"
                        + "\n 0. Analgesicos"
                        + "\n 1. Laxantes"
                        + "\n 2. Antiinfecciosos"
                        + "\n 3. Antidepresivos"
                        + "\n 4. Antitusivos"
                        + "\n 5. Mucoliticos"
                        + "\n 6. Antiacidos"
                        + "\n 7. Antiulcerosos"
                        + "\n 8. Antialergicos"
                        + "\n 9. Antidiarreicos", 0, 10);
                switch (opcionTipoMed) {
                    case 0:
                        tipo = TipoMedicamento.ANALGESICO;
                        break;
                    case 1:
                        tipo = TipoMedicamento.LAXANTES;
                        break;
                    case 2:
                        tipo = TipoMedicamento.ANTIINFECCIOSOS;
                        break;
                    case 3:
                        tipo = TipoMedicamento.ANTIDEPRESIVOS;
                        break;
                    case 4:
                        tipo = TipoMedicamento.ANTITUSIVOS;
                        break;
                    case 5:
                        tipo = TipoMedicamento.MUCOLITICOS;
                        break;
                    case 6:
                        tipo = TipoMedicamento.ANTIACIDOS;
                        break;
                    case 7:
                        tipo = TipoMedicamento.ANTIULCEROSOS;
                        break;
                    case 8:
                        tipo = TipoMedicamento.ANTIALERGICOS;
                        break;
                    case 9:
                        tipo= TipoMedicamento.ANTIDIARREICOS;
                        break; 
                }
                String toma = IO_ES.leerCadena("Introduce la forma de tomar el medicamento: ");
                String efectos = IO_ES.leerCadena("Introduce los efectos adversos del medicamento: ");

                arrayProducto[numProductos] = new Medicamento (codigo, nombre, desc, precio, cant, tipo , toma, efectos);
                numProductos ++ ;
                System.out.println("Producto(Medicamento) nuevo creado");
                break;
                
            case 1:
                Categoria cat = Categoria.HOGAR;
                System.out.println("AÑADIR PARAFARMACIA");
                String codigoP = IO_ES.leerCadena("Introduce el codigo de producto (Parafarmacia)");
                String nombreP = IO_ES.leerCadena("Introduce el nombre del  (Parafarmacia)");
                String descP = IO_ES.leerCadena("Introduce la descripcion del producto (Parafarmacia)");
                double precioP = IO_ES.leerRealLargo("Introduce el precio del producto (Parafarmacia)");
                int cantP = IO_ES.leerInteger("Introduce la cantidad de productos que tenemos (Parafarmacia)");
                int opcionCategoria = IO_ES.leerInteger("Introduce el tipo de categoria del producto:"
                        + "\n 0. Dental"
                        + "\n 1. Facial"
                        + "\n 2. Geles"
                        + "\n 3. Corporal"
                        + "\n 4. Cabello"
                        + "\n 5. Antimosquitos"
                        + "\n 6. Intima"
                        + "\n 7. Nasal"
                        + "\n 8. Ocular"
                        + "\n 9. Botiquin"
                        + "\n 10. Oidos"
                        + "\n 11. Toallitas"
                        + "\n 12. Limpieza"
                        + "\n 13. Hogar"
                        + "\n 14. Mascarillas", 0, 14);
                switch (opcionCategoria) {
                    case 0:
                        cat = Categoria.DENTAL;
                        break;
                    case 1:
                        cat = Categoria.FACIAL;
                        break;
                    case 2:
                        cat = Categoria.GELES;
                        break;
                    case 3:
                        cat = Categoria.CORPORAL;
                        break;
                    case 4:
                        cat = Categoria.CABELLO;
                        break;
                    case 5:
                        cat = Categoria.ANTIMOSQUITOS;
                        break;
                    case 6:
                        cat = Categoria.INTIMA;
                        break;
                    case 7:
                        cat = Categoria.NASAL;
                        break;
                    case 8:
                        cat = Categoria.OCULAR;
                        break;
                    case 9:
                        cat = Categoria.BOTIQUIN;
                        break;
                    case 10:
                        cat = Categoria.OIDOS;
                        break; 
                    case 11:
                        cat = Categoria.TOALLITAS;
                        break; 
                    case 12:
                        cat = Categoria.LIMPIEZA;
                        break; 
                    case 13:
                        cat = Categoria.HOGAR;
                        break; 
                    case 14:
                        cat = Categoria.MASCARILLAS;
                        break;     
                }

                int dosis = IO_ES.leerInteger("Introuduce las dosis por unidad:");
                double descuento = IO_ES.leerRealLargo("Introduce el descuento: ");

                arrayProducto[numProductos] = new ParaFarmacia (codigoP, nombreP, descP, precioP, cantP, cat , dosis, descuento);
                numProductos ++ ;
                System.out.println("Producto(ParaFarmacia) nuevo creado");
                break;
        }     
    }
    
    public static void eliminarProducto(){
        for (int i = 0; i < numProductos; i++) {
                if (!arrayProducto[i].isBaja() ) {
                        System.out.println("Indice productos: " + i + " -> " + arrayProducto[i].getNombre() + " - Codigo: " + arrayProducto[i].getCodigo());
                }  
        }
        int indice = IO_ES.leerInteger("Introduce el producto a eliminar(indice)", 0, numProductos-1);
        
        if (!arrayProducto[indice].isBaja()) {
            String borrado = arrayProducto[indice].getNombre() + "(*BAJA)";
        
            boolean confirm = IO_ES.leerBooleano("¿Seguro quieres eliminar el producto? (SI o NO)");
            if (confirm) {
               arrayProducto[indice].setNombre(borrado);
               arrayProducto[indice].setBaja(true);
               arrayProducto[indice].quitarUnidades(arrayProducto[indice].getUnidades());
                System.out.println("Producto dado de BAJA");
            }else{
                System.out.println("Producto no dado de BAJA");
            }    
        }else{
            System.out.println("El producto ya esta borrado");
        }
    }
    
    public static void modificarProducto(){
        for (int i = 0; i < numProductos; i++) {
                System.out.println("Indice productos: " + i + " -> " + arrayProducto[i].getNombre() + " - Codigo: " + arrayProducto[i].getCodigo());
        }
        int indice = IO_ES.leerInteger("Introduce el prodcuto a modificar(indice)", 0, numProductos-1);
        int opcion = IO_ES.leerInteger("Opcion a modificar : \n 1. Codigo Producto \n 2. Nombre \n 3. Descripcion \n 4. Precio", 0, 4);
        
        switch (opcion) {
                case 1:
                    String codigo = IO_ES.leerCadena("Introduce el nuevo codigo de producto");
                    arrayProducto [indice].setCodigo(codigo);
                    System.out.println("Codigo modificado");
                    break;
                case 2:
                    String nombre = IO_ES.leerCadena("Introduce el nuevo nombre de prodcuto");
                    arrayProducto[indice].setNombre(nombre);
                    System.out.println("Nombre modificado");
                    break;
                case 3:
                    String descripcion = IO_ES.leerCadena("Introduce la nueva descripcion del producto");
                    arrayProducto[indice].setDescripcion(descripcion);
                    System.out.println("Descripcion modificada");
                    break;
                case 4:
                    double precio = IO_ES.leerRealLargo("Introduce el nuevo precio del producto");
                    arrayProducto[indice].setPrecio(precio);
                    System.out.println("Precio modificado");
                    break;          
            }
    }
    
    public static void listarProductos(){
        int opcion = IO_ES.leerInteger("Productos Totales: " + numProductos + "\n Selecciona una opcion : \n 0. Lista Producto \n 1. Lista Productos (Bajas)", 0, 1);
        
        switch (opcion) {
            case 0:
                for (int i = 0; i < numProductos; i++) {
                    if (!arrayProducto[i].isBaja() ) {
                        System.out.println("Indice productos: " + i + " -> " + arrayProducto[i].getNombre() + " - Codigo: " + arrayProducto[i].getCodigo());
                    }  
                }
                int op = IO_ES.leerInteger("Selecciona el indice del producto a mostar", 0,numProductos-1);
                if (!arrayProducto[op].isBaja()){
                    System.out.println(arrayProducto[op].toString());
                }else{
                    System.out.println("El producto seleccionado no se encuentra en esta lista sino en -> Lista Productos (Baja)");
                }
                break;
            case 1:
                for (int i = 0; i < numProductos; i++) {
                    if (arrayProducto[i].isBaja() ) {
                        System.out.println("Indice productos: " + i + " -> " + arrayProducto[i].getNombre() + " - Codigo: " + arrayProducto[i].getCodigo());
                    }   
                }
                 int op2 = IO_ES.leerInteger("Selecciona el indice del producto a mostar", 0, numProductos-1);
                 if (arrayProducto[op2].isBaja() == true){
                    System.out.println(arrayProducto[op2].toString());
                }else{
                    System.out.println("El producto seleccionado no se encuentra en esta lista sino en ->  Lista Producto");
                }
                break;
        }
    }
    
    public static void anadirUnidades(){
        for (int i = 0; i < numProductos; i++) {
            if (!arrayProducto[i].isBaja() ) {
                System.out.println("Indice productos: " + i + " -> " + arrayProducto[i].getNombre() + " - Codigo: " + arrayProducto[i].getCodigo());
            }  
        }
        int indice = IO_ES.leerInteger("Introduce el indice del producto a añadir unidades", 0, numProductos-1);
        
        if(!arrayProducto[indice].isBaja()){
            int cantidad = IO_ES.leerInteger("Introduce la cantidad a añadir");
            arrayProducto[indice].anadirUnidades(cantidad);
        }else{
            System.out.println("No se puede añadir unidades a un producto dado de baja");
        } 
    }
    
    public static void quitarUnidades(){
       for (int i = 0; i < numProductos; i++) {
            if (!arrayProducto[i].isBaja() ) {
                System.out.println("Indice productos: " + i + " -> " + arrayProducto[i].getNombre() + " - Codigo: " + arrayProducto[i].getCodigo());
            }  
        }
        int indice = IO_ES.leerInteger("Introduce el indice del producto a quitar unidades", 0 ,numProductos);
        
        if(!arrayProducto[indice].isBaja()){
            int cantidad = IO_ES.leerInteger("Introduce la cantidad a quitar",0);
            arrayProducto[indice].quitarUnidades(cantidad);
            
        }else{
            System.out.println("No se puede quitar unidades a un producto dado de baja");
        }   
    }

    public static void limpiarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            //No hace nada
        }
    }
}
