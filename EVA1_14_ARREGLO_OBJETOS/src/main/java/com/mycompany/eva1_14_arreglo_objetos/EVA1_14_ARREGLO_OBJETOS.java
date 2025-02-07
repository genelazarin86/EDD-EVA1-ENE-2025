/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_arreglo_objetos;

/**
 *
 * @author Admin
 */
public class EVA1_14_ARREGLO_OBJETOS {

    public static void main(String[] args) {
        Persona datos[] = new Persona[5];
        
       datos[0].setNombre("gene");
       datos[1] = new Persona();
       datos[2] = new Persona();
       datos[3] = new Persona();
       datos[4] = new Persona();
       
       for(int i = 0; i< datos.length; i++){
       datos[i] = new Persona();
       }
      
    }
}
class Persona{
private String nombre;
public String getNombre(){
return nombre;

}
public void setNombre(String nombre){
this.nombre= nombre;
}

}