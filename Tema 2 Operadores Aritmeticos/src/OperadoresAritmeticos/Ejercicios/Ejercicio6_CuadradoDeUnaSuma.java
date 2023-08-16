package OperadoresAritmeticos.Ejercicios;

import java.util.Scanner;

public class Ejercicio6_CuadradoDeUnaSuma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        int b;
        int cuadrado = 2;
        double resultado;

        System.out.println("Escribe el valor A: ");
        a = teclado.nextInt();
        System.out.println("Escribe el valor B: ");
        b = teclado.nextInt();

        resultado = (Math.pow(a,cuadrado) + Math.pow(b,cuadrado)) + (2 * a * b);
        System.out.println("El resultado es: " + resultado);

    }
}
