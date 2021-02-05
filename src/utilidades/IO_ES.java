/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Scanner;

/**
 * Esta clase contiene todos los metodos necesarios para recibir de manera correcta datos introducidos por el usuario
 * @author juanc
 * @version 1.0
 * 
 */
public class IO_ES {
    
    public static int leerInteger(){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       int entero = 0;
            do{
                try{
                  entero = a.nextInt();
                  bln=true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return entero;
   }
    
    public static int leerInteger(String mensaje){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       int entero = 0;
            do{
                System.out.println(mensaje);
                try{
                  entero = a.nextInt();
                  bln=true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return entero;
   }
    
    public static int leerInteger(String mensaje, int min){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       int entero = 0;
            do{
                System.out.println(mensaje);
                try{
                    entero = a.nextInt();
                    if (entero >= min){    
                        bln=true;
                    }else {
                        System.out.println("Numero introudcido no valido introduce un valor superior a " + min);
                    }
                  
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return entero;
   }
    
    public static int leerInteger(String mensaje, int min, int max){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       int entero = 0;
            do{
                System.out.println(mensaje);
                try{
                    entero = a.nextInt();
                    if (entero >= min && entero <= max){
                        bln=true;
                    }else{
                        System.out.println("Numero introducido no valido introduce un numero entre " + min + " y " + max  + "ambos inclusive" );
                    }
                  
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return entero;
   }
     public static long leerEnteroLargo(){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       long enteroLargo = 0 ;
            do{
                try{
                  enteroLargo = c.nextLong();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return enteroLargo;    
   }
    
     public static long leerEnteroLargo(String mensaje){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       long enteroLargo = 0 ;
            do{
                System.out.println(mensaje);
                try{
                  enteroLargo = c.nextLong();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return enteroLargo;    
   }
     
     public static float leerReal(){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       float real = 0;
            do{
                try{
                  real = a.nextFloat();
                  bln=true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return real;
   }
    
    public static float leerReal(String mensaje){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       float real = 0;
            do{
                System.out.println(mensaje);
                try{
                  real = a.nextFloat();
                  bln=true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return real;
   }
    
    public static float leerReal(String mensaje, float min){
       boolean bln = false;
       Scanner a = new Scanner (System.in);
       float real = 0;
            do{
                System.out.println(mensaje);
                try{
                    real = a.nextFloat();
                    if (real >= min){    
                        bln=true;
                    }else {
                        System.out.println("Numero introudcido menor al especificado por parametro");
                    }
                  
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage()); 
                }
                a.nextLine();
            }while(!bln);
        return real;
    }
    
    public static double leerRealLargo(){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       double realLargo = 0 ;
            do{
                try{
                  realLargo = c.nextDouble();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return realLargo;    
   }
    
     public static double leerRealLargo(String mensaje){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       double realLargo = 0 ;
            do{
                System.out.println(mensaje);
                try{
                  realLargo = c.nextDouble();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return realLargo;    
   }
     
   public static String leerCadena(){
       boolean bln = false;
       Scanner sc = new Scanner (System.in);
       String cadena = "" ;
            do{
                try{
                  cadena = sc.nextLine();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                //sc.nextLine();
            }while(!bln); 
        return cadena;    
   }
   
   public static String leerCadena(String mensaje){
       boolean bln = false;
       Scanner sc1 = new Scanner (System.in);
       String cadena = "" ;
            do{
                System.out.println(mensaje);
                try{
                  cadena = sc1.nextLine();
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                //sc1.nextLine();
            }while(!bln); 
        return cadena;    
   }
   
   public static String leerCadena(String mensaje, int longitud){
       boolean bln = false;
       Scanner sc2 = new Scanner (System.in);
       String cadena = "";
       int comparacion;
            do{
                System.out.println(mensaje);
                try{
                  cadena = sc2.nextLine();
                  comparacion = cadena.length();
                    if (comparacion == longitud) {
                        bln = true;
                    }else{
                        System.out.println("La longitud de la cadena no es la indicada");
                    }
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                //sc2.nextLine();
            }while(!bln); 
        return cadena;    
   }
   
   public static char leerCaracter(){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       String cadena ;
       char caracter = 'a' ;
            do{
                try{
                  cadena = c.nextLine();
                  caracter = cadena.charAt(0);
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                //c.nextLine();
            }while(!bln); 
        return caracter;    
   }
   
   public static char leerCaracter(String mensaje){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       String cadena;
       char caracter = 'a' ;
            do{
                System.out.println(mensaje);
                try{
                  cadena = c.nextLine();
                  caracter = cadena.charAt(0);
                  bln = true;
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                //c.nextLine();
            }while(!bln); 
        return caracter;    
   }
   
   public static boolean leerBooleano(){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       String entrada, minuscula;
       char caracter;
       boolean b = true;
            do{
                try{
                  entrada = c.next();
                  minuscula = entrada.toUpperCase();
                  caracter = minuscula.charAt(0);
                    if (caracter == 'S' ) {
                        b = true;
                        bln = true;
                    }else if ( caracter == 'N'){
                        b = false;
                        bln = true;
                    }else{
                        System.out.println("introduce Si o No");
                    }
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return b;    
   }
   
   public static boolean leerBooleano(String mensaje){
       boolean bln = false;
       Scanner c = new Scanner (System.in);
       String entrada, minuscula;
       char caracter;
       boolean b = true;
            do{
                System.out.println(mensaje);
                try{
                  entrada = c.next();
                  minuscula = entrada.toUpperCase();
                  caracter = minuscula.charAt(0);
                    if (caracter == 'S' ) {
                        b = true;
                        bln = true;
                        //System.out.println(b);
                    }else if ( caracter == 'N'){
                        b = false;
                        bln = true;
                        //System.out.println(b);
                    }else{
                        System.out.println("No has introducido si o no");
                    }
                }
                catch(Exception e){
                  System.out.println("Error: Tipo de dato introducido no valido" + e.getMessage());
                }
                c.nextLine();
            }while(!bln); 
        return b;    
   }
   
   public static void escrbir(String mensaje){
                System.out.print(mensaje);
   }
   
  public static void escrbirLn(String mensaje){
                System.out.println(mensaje);
                 
   }
   
    
}