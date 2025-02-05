/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva6_arreglos_2;

/**
 *
 * @author Admin
 */
public class EVA6_ARREGLOS_2 {

    public static void main(String[] args) {
        int datos[] = new int[20];
        System.out.println(datos);
        System.out.println(datos.length);
        //llenar arreglo de valores aleatorios
        for(int i = 0; i < datos.length ; i++){
            datos[i] = (int)(Math.random()* 100);
        
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.println("[" + datos[i] +"]");
            
            
        }
        
        
    }
}
