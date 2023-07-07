package OperadoresAritmeticos;

import java.util.Scanner;

public class Clase_Math {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*Metodo RAIZ CUADRADA*/
        int raizCuadradaInt = (int) Math.sqrt(9);
        double raizCuadradaDouble = Math.sqrt(936);
        System.out.println(raizCuadradaInt);
        System.out.println(raizCuadradaDouble);
        System.out.println("-----------------");
        /*Elevar un nuemero*/
        double base = 5;
        double exponente = 2;
        double resultado = Math.pow(base,exponente);
        System.out.println(resultado);
        System.out.println("-----------------");
        /*Redondear un numero*/
        double numero = 5.65;
        double resultadoNumero = Math.round(numero);
        System.out.println(resultadoNumero);

        System.out.println("Insertanos un numero para sacar raiz cuadrada: ");
        double numeroUsuario = teclado.nextDouble();
        double resultadoUsuario = Math.sqrt(numeroUsuario);
        System.out.println("La raiz cuadrada de tu numero es: " + resultadoUsuario);

        double random =  Math.random();
        System.out.println(random);






    }
}
