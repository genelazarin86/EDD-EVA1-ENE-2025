/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_copia_real;

/**
 *
 * @author Admin
 */
public class EVA1_12_COPIA_REAL {

    public static void main(String[] args) {
       int datos[]= new int[10];
        System.out.println(datos);
       for (int i = 0; i < datos.length; i++) {
           datos[i]=(int)(Math.random()*100);
           
            
        }
       for(int valor:datos){
           System.out.print("{" + valor +" ]");
           
    }
        System.out.println("");
       int [] reducido = new int[5];
       
       
       for (int i = 0; i < 5; i++) {
           reducido[i] = datos[i];
          
             System.out.print("{" + reducido[i] + "]");
        }
       
    }
}
