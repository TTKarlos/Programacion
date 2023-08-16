package OperadoresAritmeticos.Ejercicios;

import java.util.Scanner;

public class Ejercicio3_DineroTotal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float dineroGuillermo;
        float dineroJuan;
        float dineroLuis;
        float dineroTotal;
        System.out.println("Indica cuanto dinero tiene Guillermo: ");
        dineroGuillermo = teclado.nextFloat();
        dineroLuis = dineroGuillermo / 2;
        dineroJuan = (dineroGuillermo + dineroLuis) / 2;
        dineroTotal = dineroGuillermo + dineroLuis + dineroJuan;
        System.out.println("Guillermo tiene: " + dineroGuillermo + "€");
        System.out.println("Luis tiene: " + dineroLuis + "€");
        System.out.println("Juan tiene: " + dineroJuan +"€");
        System.out.println("Y entre los 3 tienen: " + dineroTotal + "€");
    }
}
