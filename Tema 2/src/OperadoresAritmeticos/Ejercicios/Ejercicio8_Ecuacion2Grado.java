package OperadoresAritmeticos.Ejercicios;

import java.util.Scanner;

public class Ejercicio8_Ecuacion2Grado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el valor de A: ");
        int a = teclado.nextInt();
        System.out.println("Escribe el valor de B: ");
        int b = teclado.nextInt();
        System.out.println("Escribe el valor de C: ");
        int c = teclado.nextInt();

        int negativo = (int) (-b-Math.sqrt(Math.pow(b,2) - (4*a*c))/(2*a));
        int positivo = (int) (-b+Math.sqrt(Math.pow(b,2) - (4*a*c))/(2*a));
        System.out.println(positivo);
        System.out.println(negativo);

    }
}
