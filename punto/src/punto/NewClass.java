/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto;

/**
 *
 * @author CT7-PC18
 */
public class NewClass {
   public static void main(String[] args){ 
       System.out.println("...Clase Punto tiempo..."); 
       PuntoTiempo pt = new PuntoTiempo(3,5,7); 
       System.out.println("La velocidad es:"+pt.velocidad()); 
       //pt.PuntoEspacial = new PuntoTiempo(4,6,8); 
       pt.CargaPE(); 
       System.out.println("La subvelocidad es:" +pt.PuntoEspacial.velocidad());
   } 
}
