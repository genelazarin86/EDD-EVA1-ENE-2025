/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_ejercicios_basicos_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA1_EJERCICIOS_BASICOS_1 {

    public static void main(String[] args) {
     Scanner captu = new Scanner (System.in);
     int monto;
          
        System.out.println("captura el monto");
       monto = captu.nextInt();
       double descuento10 = monto * .10;
       double des20 = monto*.20;

       if(monto < 100){
           System.out.println("su precio final es " + monto);
       
       }
       if(monto>=100 && monto <= 500){
           
           System.out.println("su descuento sera del 10 porciento ,su precio final es " 
                   + (monto - descuento10) );
       }
       if(monto > 500){
           System.out.println("su descuento sera del 20%, su cantidad de compra es"+ monto + "su precio con descuento sera de"
                   + "" + (monto - des20));
       
       }
    }
}
