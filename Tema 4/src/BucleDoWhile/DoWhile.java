package BucleDoWhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador;
        int numero = 0;
        System.out.println("Escribe la cantidad de veces que quieres que se repita: ");
        contador = teclado.nextInt();
        do {
            System.out.println(numero);
            numero ++;
        }while (numero <= contador);
    }
}
