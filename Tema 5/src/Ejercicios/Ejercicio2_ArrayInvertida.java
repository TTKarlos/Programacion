package Ejercicios;

import java.util.Scanner;

public class Ejercicio2_ArrayInvertida {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int i = 0;i < numeros.length;i++){
            System.out.println("Escribe el numero " + (i+1));
            numeros[i]=teclado.nextInt();
        }
        System.out.println("Los numeros a la inversa son: ");
        for (int i = numeros.length -1;i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
