package Condicionales.Ejercicios;

import java.util.Scanner;

public class Ejercicio5_SalarioSemanal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float precioPorMenos40Horas = 16f;
        float precioHorasExtras = 20f;
        int salario;
        int horas;
        System.out.println("Introduce el numero de horas que trabajas: ");
        horas = teclado.nextInt();
        float horasExtras;
        if (horas <= 40){
            salario = horas *= precioPorMenos40Horas;
            System.out.println("El salaraio es igual a " + salario);
        } else  {
            horasExtras = horas - 40;
            salario = (int) ((40 * precioPorMenos40Horas) + (horasExtras * precioHorasExtras));
            System.out.println("El salario es igual a " + salario);
        }

    }
}
