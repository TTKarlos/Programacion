package Ejercicios;

public class Ejercicio7_Marco {
    public static void main(String[] args) {
        int[][] marco = new int[5][5];
        for (int filas = 0; filas < marco.length; filas++) {
            for (int columnas = 0; columnas < marco[0].length; columnas++) {
                    marco[filas][columnas] = 0;
                    if (filas == 0 || filas == 4){
                        marco[filas][columnas] = 1;
                    } else if (columnas == 0 || columnas == 4) {
                        marco[filas][columnas] = 1;
                    }
                System.out.print(marco[filas][columnas] + " ");
            }
            System.out.println(" ");
        }
    }
}
