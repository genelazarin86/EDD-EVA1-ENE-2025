/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_19_falso;

/**
 *
 * @author Admin
 */
public class EVA1_19_FALSO {

    public static void main(String[] args) {
      for (int i = 5; i > 0; i--) {
          System.out.print(i + "-"); 
                 
            
        }
       listarNumeroRecu(5);
    }
    
    public static void listarNumeroRecu(int valor){
        System.out.println(valor + "-");
        if(valor>1)
        listarNumeroRecu(valor -1 );
    }
}

