package Ejercicios;

import java.util.Scanner;

public class Ejercicio21_Negativos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros;
        boolean contadorNegativos = false;
        for (int i = 1; i < 11; i++) {
            System.out.println("Introduce el numero " + i);
            numeros = teclado.nextInt();
            if (numeros < 0){
                contadorNegativos = true;
            }
        }

        if (contadorNegativos == true){
            System.out.println("Si existe al menos 1 numero negativo");
        }else {
            System.out.println("No existe ningun numero negativo");
        }
    }
}
