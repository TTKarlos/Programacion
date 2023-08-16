package Matrices;

public class MatrizMultiDimensional {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[0].length; columnas++) {
                System.out.print(matriz[filas][columnas]);
            }
            System.out.println(" ");
        }

    }
}
