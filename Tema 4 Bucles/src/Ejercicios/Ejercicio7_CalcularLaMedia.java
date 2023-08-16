package Ejercicios;

import java.util.Scanner;

public class Ejercicio7_CalcularLaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros;
        int contador = 0;
        int contadorNumeros =0;
        int media = 0;
        System.out.println("Escribe un numero: ");
        numeros = teclado.nextInt();

        while (numeros > 0){
            System.out.println("Escribe otro numero: ");
            numeros = teclado.nextInt();
            numeros += numeros;
            contador ++;
        }

        System.out.println(contadorNumeros);
        System.out.println("La media es: " + media);



    }
}
