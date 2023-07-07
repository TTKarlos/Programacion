package Ejercicios;

import java.util.Scanner;

public class Ejercicio6_SumaIterativa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros;
        int contadorNumeros = 0;
        do {
            System.out.println("Escribe un numero: ");
            numeros = teclado.nextInt();
            contadorNumeros += numeros;
        }while (numeros != 0);
        System.out.println("La suma de todos los numeros es: " + contadorNumeros);



    }
}
