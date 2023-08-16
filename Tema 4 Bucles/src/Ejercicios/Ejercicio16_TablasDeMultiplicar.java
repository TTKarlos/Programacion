package Ejercicios;

import java.util.Scanner;

public class Ejercicio16_TablasDeMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroTabla;
        int resultado;
        do {
            System.out.println("Escirbe el numero de la tabla que quieras mostar [0-10]: ");
            numeroTabla = teclado.nextInt();
        }while (numeroTabla > 10 || numeroTabla < 0);
        System.out.println("Tabla del " + numeroTabla);
        System.out.println("--------------");
        for (int i = 1; i <= 10; i++) {
            resultado = i * numeroTabla;
            System.out.println(i + " x " + numeroTabla + " = " + resultado);

            }
        }


}
