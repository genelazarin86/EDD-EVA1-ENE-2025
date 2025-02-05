/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva5_arreglos;

/**
 *
 * @author Admin
 */
public class EVA5_ARREGLOS {

    public static void main(String[] args) {
        int[]datos = new int[10];
        // int[] a,b,c; // tres arreglos
        // int a,b[],c; // un arreglo de tipo entero
        // ACCESO ALEATORIO (POR INDICES)
        datos [0]= 100;
        datos[1] = 200;
        // datos[10]= 1000;// genera excepcion llega hasts 9
        datos[9]= 1000;
        for (int i = 0; i < 10; i++) {
            datos[i]=100;
            
                
            }
        for (int i = 0; i < 10; i++) {
            System.out.println("{" + datos[i] + "}");
            
        }
        }
    }

