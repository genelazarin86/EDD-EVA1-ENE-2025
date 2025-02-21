/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva1_23_numerosprimos;

/**
 *
 * @author Admin
 */
public class EVA1_23_numerosPrimos {
    
    public static void main(String[] args) {
        int numero = 17; 
        System.out.println("¿El número es primo? "  + esPrimoIneficiente(numero));
    }

    public static boolean esPrimoIneficiente(int num) {
        if (num < 2) {
            return false; // Los números menores a 2 no son primos
        }

        boolean resu = true;
        for (int i = 2; i < num; i++) { 
            if (num % i == 0) {
                resu = false;
                break;
            }
        }
        return resu;
    }
    public static boolean esPrimoEficiente(int num){
           
        boolean resu = true;
        for (int i = 0; i < 10; i++) {
            
            
        }
    
            

               
           
       
    

