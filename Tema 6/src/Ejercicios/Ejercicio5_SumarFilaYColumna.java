package Ejercicios;

public class Ejercicio5_SumarFilaYColumna {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int filas=0;filas<matriz.length;filas++){
            int sumaFilas = 0;
            for (int columnas = 0; columnas < matriz[0].length; columnas++) {
                sumaFilas += matriz[filas][columnas];
            }
            System.out.println("La suma de la fila nº " + (filas + 1) + " es: " + sumaFilas);
            }
        System.out.println(" ");

        for(int columnas=0;columnas<matriz[0].length;columnas++){
            int sumaColumnas= 0;
            for (int filas = 0; filas < matriz.length; filas++) {
                sumaColumnas += matriz[filas][columnas];
            }
            System.out.println("La suma de la columna nº " + (columnas + 1) + " es: " + sumaColumnas);
        }
        System.out.println(" ");

        }

}
