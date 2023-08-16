package Ejercicios;

import java.util.Scanner;

public class Ejercicio14_Pedir10Sueldos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sueldos;
        int sumaSueldos = 0;
        int contadorSueldosMayoresDe1000 = 0;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Escribe el sueldo numero " + i);
            sueldos = teclado.nextInt();
            sumaSueldos += sueldos;
            if (sueldos >= 1000){
                contadorSueldosMayoresDe1000 ++;
            }

        }
        System.out.println("La suma total de los sueldos es: " + sumaSueldos);
        System.out.println("Hay " + contadorSueldosMayoresDe1000 + " sueldos mayores de 1000€");
    }
}
