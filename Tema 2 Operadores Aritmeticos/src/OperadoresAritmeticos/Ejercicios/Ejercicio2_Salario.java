package OperadoresAritmeticos.Ejercicios;

import java.util.Scanner;

public class Ejercicio2_Salario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float salarioXhora;
        float salario;
        float horasTrabajadas;
        System.out.println("Indique las horas trabajadas: ");
        horasTrabajadas = teclado.nextFloat();
        System.out.println("Indique el salario por hora: ");
        salarioXhora = teclado.nextFloat();
        salario = horasTrabajadas * salarioXhora;
        System.out.println("Tu salario por " + horasTrabajadas + "h trabajadas es de: " + salario + "€");


    }
}
