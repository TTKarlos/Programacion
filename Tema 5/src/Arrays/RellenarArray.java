package Arrays;

import java.util.Scanner;

public class RellenarArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroElementos;
        System.out.println("Escribe los elementos de la array: ");
        numeroElementos = teclado.nextInt();
        char[] letras = new char[numeroElementos];


        for (int i = 0; i < numeroElementos; i++) {
            System.out.println((i+1)+"Escribe un caracter: ");
            letras[i] = teclado.next().charAt(0);
        }

        System.out.println("Los caracteres de la array son: ");
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println(letras[i] + " ");
        }

    }
}
