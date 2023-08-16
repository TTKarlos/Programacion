package BucleFor;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        int contador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas veces quieres que se repita? ");
        contador = teclado.nextInt();
        for (int i = 0; i <= contador; i++){
            System.out.println(i);
        }
    }
}

