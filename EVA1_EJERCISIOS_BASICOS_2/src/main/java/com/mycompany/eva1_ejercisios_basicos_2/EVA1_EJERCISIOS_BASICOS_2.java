/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_ejercisios_basicos_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA1_EJERCISIOS_BASICOS_2 {

    public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);
      
      
     
        System.out.println("nota numerica del estudiante?");
        int califa = captu.nextInt();
        String A = "A",B = "B", C = "C",D = "D",F = "F";
        
        if(califa == 100){
            System.out.println("la calificacion del estudiante es " + A);
        }
        else if(califa>=90 && califa <100){
            System.out.println("la califa del estudiante es " + B);
        }
        else if(califa>=80 && califa<90){
            System.out.println("la califa del estudiante es " + C);
        }
        else if(califa>=70  && califa <80){
            System.out.println("la califa del estudiante es " + D);
            
        }
        else if(califa>=60 && califa < 70){
            System.out.println("la califa del estudiante es " + F );
        }
        else{
            System.out.println("la calificacion del estudiante es reprobatoria menor a 60%");
        }
    }
}
