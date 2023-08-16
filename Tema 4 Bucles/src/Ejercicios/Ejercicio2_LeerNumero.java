package Ejercicios;

import java.util.Scanner;

public class Ejercicio2_LeerNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Escribe un numero: ");
        numero = teclado.nextInt();
        while (numero != 0){
            if (numero < 0){
                System.out.println("El numero es negativo");
            }else {
                System.out.println("El numero es positivo");
            }
            System.out.println("Escribe otro numero: ");
            numero = teclado.nextInt();
        }
    }
}
