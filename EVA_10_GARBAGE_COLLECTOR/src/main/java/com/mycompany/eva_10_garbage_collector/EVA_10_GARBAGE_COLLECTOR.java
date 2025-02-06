/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_10_garbage_collector;

/**
 *
 * @author Admin
 */
public class EVA_10_GARBAGE_COLLECTOR {

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
       datos =new int[5];
        System.out.println(datos);
       for(int valor:datos){
           System.out.print("{" + valor +" ]");
}
    }
}