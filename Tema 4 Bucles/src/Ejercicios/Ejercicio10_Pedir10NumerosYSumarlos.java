package Ejercicios;

import java.util.Scanner;

public class Ejercicio10_Pedir10NumerosYSumarlos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros = 0;
        int sumaNumeros = 0;
        for (int i = 1; i <=10; i++){
            System.out.println("Escribe el numero " + i);
            numeros = teclado.nextInt();
            sumaNumeros += numeros;
        }
        System.out.println("La suma total es: " + sumaNumeros);

    }
}
