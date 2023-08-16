package OperadoresAritmeticos.Ejercicios;

import java.util.Scanner;

public class Ejercicio7_HorasSemanasDias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas;
        int dias;
        int semanas;
        System.out.println("Ingresa el numero de horas: ");
        horas = teclado.nextInt();
        semanas = horas / 168;
        dias = horas%168 / 24;
        horas = horas%24;

        System.out.println("El equivalente es: " + semanas + " semanas " + dias + " dias y " + horas + " horas");
    }
}
