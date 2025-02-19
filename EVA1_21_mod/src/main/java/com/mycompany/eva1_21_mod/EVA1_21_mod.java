/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_21_mod;

/**
 *
 * @author Admin
 */
public class EVA1_21_mod {

    public static void main(String[] args) {
   
   
        int a = 180;
        int b = 48;

        int resultado = calcularGCD(a, b);
        System.out.println("El MCD de " + a + " y " + b + " es: " + resultado);
    }

    public static int calcularGCD(int a, int b) {
        if (b == 0) {
            return a; // Caso base
        }
        return calcularGCD(b, a % b); // Recursión correcta
    }
}



