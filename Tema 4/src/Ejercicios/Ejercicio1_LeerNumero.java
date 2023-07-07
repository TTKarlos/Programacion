package Ejercicios;

import java.util.Scanner;

public class Ejercicio1_LeerNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int solucion;
        System.out.println("Escribe un numero: ");
        numero = teclado.nextInt();
        while (numero >= 0){
            solucion = (int) Math.pow(numero,2);
            System.out.println("El cuadrado del numero es: " + solucion);
            System.out.println("Escribe otro numero: ");
            numero = teclado.nextInt();
        }
    }
}
