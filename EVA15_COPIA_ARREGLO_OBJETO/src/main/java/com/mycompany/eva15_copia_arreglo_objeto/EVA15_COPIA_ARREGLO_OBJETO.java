/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva15_copia_arreglo_objeto;

/**
 *
 * @author Admin
 */
public class EVA15_COPIA_ARREGLO_OBJETO {


    public static void main(String[] args) {
        // Declaramos un arreglo de objetos Persona con espacio para 5 elementos
        Persona datos[] = new Persona[5];

        // Inicializamos cada posición del arreglo con un nuevo objeto Persona
        for (int i = 0; i < datos.length; i++) {
            datos[i] = new Persona();
        }

        // Asignamos nombres a los objetos del arreglo original
        datos[0].setNombre("Gene");
        datos[1].setNombre("Carlos");
        datos[2].setNombre("Luis");
        datos[3].setNombre("Ana");
        datos[4].setNombre("Sofia");

        // Creamos un nuevo arreglo que será una copia del arreglo original
        Persona copiaDatos[] = new Persona[datos.length];

        // Copiamos las referencias de los objetos del primer arreglo al segundo
        for (int i = 0; i < datos.length; i++) {
            copiaDatos[i] = datos[i]; // Copia las referencias, no crea nuevos objetos
        }

        // Mostramos los valores del arreglo original
        System.out.println("Arreglo original:");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Persona " + i + " - Nombre: " + datos[i].getNombre());
        }

        // Mostramos los valores del arreglo copiado
        System.out.println("\nArreglo copiado:");
        for (int i = 0; i < copiaDatos.length; i++) {
            System.out.println("Persona " + i + " - Nombre: " + copiaDatos[i].getNombre());
        }

        // Modificamos el nombre del primer objeto en el arreglo original
        datos[0].setNombre("Nuevo Gene");

        // Mostramos los valores después de la modificación para ver si afecta la copia
        System.out.println("\nDespués de modificar el nombre en el arreglo original:");
        System.out.println("Arreglo original:");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Persona " + i + " - Nombre: " + datos[i].getNombre());
        }

        System.out.println("\nArreglo copiado:");
        for (int i = 0; i < copiaDatos.length; i++) {
            System.out.println("Persona " + i + " - Nombre: " + copiaDatos[i].getNombre());
        }
    }
}

// Definimos la clase Persona con un atributo privado y métodos de acceso
class Persona {
    private String nombre;

    // Método getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método setter para asignar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
