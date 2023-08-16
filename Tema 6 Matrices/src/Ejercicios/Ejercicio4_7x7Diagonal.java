package Ejercicios;

public class Ejercicio4_7x7Diagonal {
    public static void main(String[] args) {
        System.out.println("CODIGO HECHO POR MI");

        int[][] matriz = new int[7][7];

        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[0].length; columnas++) {
                matriz[filas][columnas] = 0;
                if (filas <= columnas && columnas <= filas ){
                    matriz[filas][columnas] = 1;
                }
                System.out.print(matriz[filas][columnas] + " ");
                }
            System.out.println(" ");
            }
        System.out.println("CODIGO SOLUCION");

        int[][] matrizSolucion = new int[7][7];

        for (int filas = 0; filas < matrizSolucion.length; filas++) {
            for (int columnas = 0; columnas < matrizSolucion[0].length; columnas++) {
                if (filas == columnas){
                    matrizSolucion[filas][columnas] = 1;
                }else {
                    matrizSolucion[filas][columnas] = 0;
                }
                System.out.print(matrizSolucion[filas][columnas] + " ");
            }
            System.out.println(" ");
        }

    }
}
