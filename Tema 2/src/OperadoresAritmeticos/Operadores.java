package OperadoresAritmeticos;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero1,numero2,suma,resta,multi,divi,resto;

        System.out.println("Pon 2 numeros: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 * numero2;
        divi = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multi);
        System.out.println("La divi es: " + divi);
        System.out.println("La resto es: " + resto);



    }
}
