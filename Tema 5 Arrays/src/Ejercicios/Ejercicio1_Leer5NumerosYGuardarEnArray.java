package Ejercicios;

import java.util.Scanner;

public class Ejercicio1_Leer5NumerosYGuardarEnArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
                System.out.println("Escribe un numero: ");
                numeros[i] = teclado.nextInt();
        }
        System.out.println("Los numeros escritos son: ");
        for (int listaNumeros:numeros) {
            System.out.print(listaNumeros);
        }


    }
}
