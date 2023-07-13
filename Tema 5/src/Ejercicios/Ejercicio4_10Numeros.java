package Ejercicios;

import java.util.Scanner;

public class Ejercicio4_10Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe el numero " + (i+1));
            numeros[i] = teclado.nextInt();
        }
        for (int i = 0; i < numeros.length -1; i++) {
            System.out.println(numeros[i]);
        }
    }
}
