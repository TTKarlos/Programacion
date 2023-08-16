package OperadoresAritmeticos.Ejercicios;

import java.util.Scanner;

public class Ejercicio1_Operadores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float numero1;
        float numero2;
        float numero3;
        float resultadoSuma;
        System.out.println("Escribe 3 numeros para sumar: ");
        numero1 = teclado.nextFloat();
        numero2 = teclado.nextFloat();
        numero3 = teclado.nextFloat();
        resultadoSuma = numero1 + numero2 + numero3;
        System.out.println("El resultado de la suma de los 3 numero introducidos es: " + resultadoSuma);

    }
}
