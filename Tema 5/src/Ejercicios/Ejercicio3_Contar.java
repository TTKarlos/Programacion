package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_Contar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float[] numeros = new float[5];
        float contadorPositivos = 0;
        float numeroPositivos = 0;
        float mediaPositivos;
        float contadorNegativos= 0;
        float numeroNegativos = 0;
        float mediaNegativos;
        float contadorZeros = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe el numero " + (i+1));
            numeros[i] = teclado.nextFloat();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0){
                contadorPositivos = contadorPositivos + numeros[i];
                numeroPositivos ++;
            } else if (numeros[i] < 0) {
                contadorNegativos = contadorNegativos + numeros[i];
                numeroNegativos ++;
            }else {
                contadorZeros ++;
            }
        }
        mediaPositivos = contadorPositivos / numeroPositivos;
        mediaNegativos = contadorNegativos / numeroNegativos;
        System.out.println("La media de los positivos es: " + mediaPositivos);
        System.out.println("La media de los negativos es: " + mediaNegativos);
        System.out.println("El numero de zeros que hay es: " + contadorZeros);



    }
}
