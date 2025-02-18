/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_promedio;

import java.util.Scanner;


public class EVA1_18_PROMEDIO {

   
        
        


    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);

        System.out.print("Número de grupos: ");
        int numGrupos = captu.nextInt();
        
        double promedioGlobal = 0;
        int totalEstudiantes = 0;

        for (int i = 0; i < numGrupos; i++) {
            System.out.print("Número de estudiantes en el grupo " + (i + 1) + ": ");
            int numEstudiantes = captu.nextInt();
            Estudiante[] estudiantes = new Estudiante[numEstudiantes];

            double sumaCalificaciones = 0;

            for (int j = 0; j < numEstudiantes; j++) {
                System.out.print("Calificación del estudiante " + (j + 1) + ": ");
                int calif = captu.nextInt();
                estudiantes[j] = new Estudiante(calif);
                sumaCalificaciones += calif;
            }

            double promedioGrupo = sumaCalificaciones / numEstudiantes;
            System.out.println("Promedio del grupo " + (i + 1) + ": " + promedioGrupo);

            promedioGlobal += sumaCalificaciones;
            totalEstudiantes += numEstudiantes;
        }

        if (totalEstudiantes > 0) {
            promedioGlobal /= totalEstudiantes;
            System.out.println("Promedio global de todos los grupos: " + promedioGlobal);
        } else {
            System.out.println("No hay estudiantes registrados.");
        }

        captu.close();
    }
}

class Estudiante {
    private int califa;

    public Estudiante(int califa) {
        this.califa = califa;
    }

    public int getCalifa() {
        return califa;
    }

    public void setCalifa(int califa) {
        this.califa = califa;
    }
}
