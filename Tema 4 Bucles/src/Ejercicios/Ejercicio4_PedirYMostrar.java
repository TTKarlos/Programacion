package Ejercicios;

import java.util.Scanner;

public class Ejercicio4_PedirYMostrar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros;
        int contador = 0;
        System.out.println("Escribe un numero: ");
        numeros = teclado.nextInt();
       while (numeros >= 0){
           contador ++;
           System.out.println("Se han introducido: " + contador + " numeros");
           System.out.println("Escribe otro numero: ");
           numeros = teclado.nextInt();
       }


    }
}
