/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_for_each;

/**
 *
 * @author Admin
 */
public class EVA1_9_FOR_EACH {

    public static void main(String[] args) {
       int datos[]= new int[10];
       for (int i = 0; i < datos.length; i++) {
           datos[i]=(int)(Math.random()*100);
           
            
        }
       for(int valor:datos){
           System.out.print("{" + valor +" ]");
           
           
       }
           
           
           
       
       
    }
}
