package Ejercicios;

import java.util.Scanner;

public class Ejercicio5_Mezclar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];


        System.out.println("RELLENA LA TABLA 1");
        System.out.println("-------------------");

        for (int i = 0; i < tabla1.length; i++) {
            System.out.print("Escribe el numero " + (i+1) + ": ");
            tabla1[i] = teclado.nextInt();
        }
        System.out.println("RELLENA LA TABLA 2");
        System.out.println("-------------------");
        for (int i = 0; i < tabla2.length; i++) {
            System.out.print("Escribe el numero " + (i+1) + ": ");
            tabla2[i] = teclado.nextInt();
        }
        int[] tabla3 = new int[20];
        System.out.println("RELENAR TABLA 3 REMPLAZANDO");
        System.out.println("---------------------------");

        int guardarNumeros = 0;
        for (int i = 0; i < 10; i++) {
            tabla3[guardarNumeros] = tabla1[i];
            guardarNumeros++;
            tabla3[guardarNumeros] = tabla2[i];
            guardarNumeros++;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(tabla3[i]);
        }


    }
}
