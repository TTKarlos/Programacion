package Ejercicios;

import java.util.Scanner;

public class Ejercicio6_RemplazaDe3En3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] tabla1 = new int[12];
        int[] tabla2 = new int[12];
        int[] tabla3 = new int[24];
        System.out.println("TABLA 1");
        for (int i = 0; i < tabla1.length; i++) {
            System.out.println("Escribe el numero " + (i+1));
            tabla1[i]= teclado.nextInt();
        }
        System.out.println("TABLA 2");
        for (int i = 0; i < tabla2.length; i++) {
            System.out.println("Escribe el numero " + (i+1));
            tabla2[i]= teclado.nextInt();
        }

        int guardarNumerosTabla12 = 0;
        int guardaNumerosTabla3 = 0;
        while (guardarNumerosTabla12<12){
            for (int i = 0; i < 3; i++) {
                tabla3[guardaNumerosTabla3] = tabla1[guardarNumerosTabla12+i];
                guardaNumerosTabla3++;
            }
            for (int i = 0; i < 3; i++) {
                tabla3[guardaNumerosTabla3] = tabla2[guardarNumerosTabla12 + i];
                guardaNumerosTabla3++;
            }
            guardarNumerosTabla12+=3;
        }


        for (int i = 0; i < tabla3.length;i++) {
            System.out.println(tabla3[i]);
        }

    }
}
