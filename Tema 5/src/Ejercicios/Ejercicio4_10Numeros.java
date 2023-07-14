package Ejercicios;

import java.util.Scanner;

public class Ejercicio4_10Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        int primerNumero = 0;
        int ultimoNumero =0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe el numero " + (i+1));
            numeros[i] = teclado.nextInt();
        }
        System.out.println("El resultado es: " );
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
            System.out.print(numeros[9-i] + " ");
        }
        System.out.println(" ");

    }
}
