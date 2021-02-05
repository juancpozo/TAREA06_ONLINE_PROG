/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;
/**
 * Esta clase se encarga mediante el metodo validarNif de mediante un nof recibido por parametro validar si es correcto o no
 * @author juanc
 * @version 1.0
 * 
 */
public class ValidarDatos {
    
   public static boolean validarNif(String nif){
      boolean resultado = false;
      boolean exp , exp2;
      int parteNumericaDni, parteNumericaNie,operacion, operacionNie;
      String numerosDni, numerosNie;
      char elegido, letraDni, letraNieInicio, letraNieFinal, mayuscula, mayusculaNieInicio, mayusculaNieFinal, elegidoNie;
      
      try{
            exp = nif.matches("^[0-9]{8}[ABCDEFGHJKLMNPQRSTVWXYZ]{1}$");//Expresion Dni
            //exp2 = nif.matches("^[XYZ]{1}[0-9]{7}[ABCDEFGHJKLMNPQRSTVWXYZ]{1}$");// Expresion Nie
            
            char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

            //Operaciones DNI
            numerosDni = nif.substring(0, 8);//Obtenemos la parte numerica del dni
            parteNumericaDni = Integer.parseInt(numerosDni);// Parse a int
            
            operacion = parteNumericaDni % 23;//Modulo 23 para saber letra
            elegido = letras [operacion];//Obetener letra del array char []letras
            
            letraDni = nif.charAt(8);//Obetenemos la letra del Dni
            mayuscula = Character.toUpperCase(letraDni);// Pasamos esta a mayuscula
            
        /*
            //Operaciones NIE
            letraNieInicio = nif.charAt(0);
            numerosNie = nif.substring(1, 8);
            parteNumericaNie = Integer.parseInt(numerosNie);
            mayusculaNieInicio = Character.toUpperCase(letraNieInicio);
            letraNieFinal = nif.charAt(8);
            mayusculaNieFinal = Character.toUpperCase(letraNieFinal);
            elegidoNie = 'A';
            
            switch (mayusculaNieInicio) {
              case 'X':
                  operacionNie = parteNumericaNie % 23;
                  elegidoNie = letras [operacionNie];
                  break;
              case 'Y':
                  operacionNie = (parteNumericaNie +10000000)  % 23;
                  elegidoNie = letras [operacionNie];
                  break;
              case 'Z':
                  operacionNie = (parteNumericaNie +20000000)  % 23;
                  elegidoNie = letras [operacionNie];
                  break;                
          }
        */
            
             if ( (exp = true && mayuscula == elegido)/* || (exp2 = true && mayusculaNieFinal == elegidoNie)*/){
                 resultado = true;
             }else{
                 resultado = false;
             }
      }catch (Exception e){
          System.out.println("Error: " + e.getMessage());
      }
      
      return resultado; 
   }
}
