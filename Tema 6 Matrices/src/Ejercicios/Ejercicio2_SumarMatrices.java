package Ejercicios;

public class Ejercicio2_SumarMatrices {
    public static void main(String[] args) {
        int[][] matriz1 = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] matriz2 = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] suma = new int[3][3];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            System.out.print(suma[i][j]);
            }
            System.out.println(" ");

        }





    }
}
