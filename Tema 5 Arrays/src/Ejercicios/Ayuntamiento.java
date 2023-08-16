package Ejercicios;

import java.util.Scanner;

public class Ayuntamiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el sueldo de los encuestados: ");
        int[] sueldo = new int[10];
        for (int i = 0; i < sueldo.length; i++) {

            sueldo[i] = teclado.nextInt();
            if (teclado.nextInt() < 0){
                break;
            }
        }



    }
}
