package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_TransponerMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("Escribe la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Matriz[" + i + "][" + j + "]:");
                matriz[i][j] = teclado.nextInt();
            }
        }
        System.out.println("Matriz original: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("Matriz traspuesta: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[j][i]);
            }
            System.out.println(" ");
        }

    }
}
