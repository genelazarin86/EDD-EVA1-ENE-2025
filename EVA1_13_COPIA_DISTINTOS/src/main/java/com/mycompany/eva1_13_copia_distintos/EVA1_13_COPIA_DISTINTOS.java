/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_copia_distintos;

/**
 *
 * @author Admin
 */
public class EVA1_13_COPIA_DISTINTOS {

    public static void main(String[] args) {
        int datos[]= new int[20];
        System.out.println(datos);
       for (int i = 0; i < datos.length; i++) {
           datos[i]=(int)(Math.random()*100);
           
            
        }
       for(int valor:datos){
           System.out.print("{" + valor +" ]");
    }
        System.out.println("");
       int [] reducido = new int[10];
       for (int i = 0; i < reducido.length; i++) {
           reducido[i] = datos[i];
            System.out.print("[" + reducido[i] + "]");
        }
}
}