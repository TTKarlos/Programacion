package Ejercicios;

public class OrdenarArray {
    public static void main(String[] args) {
        int[] numeros = {20,30,50,80,100,10,4};

        int[] resultado = ordenarMenorMayor(numeros);
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }
    public static int[] ordenarMenorMayor(int[] inicio){
        for (int i = 0; i < inicio.length; i++) {
            for (int j = i+1; j < inicio.length; j++) {
                if (inicio[j] < inicio[i]){
                    int anteriorNumero = inicio[i];
                    int nuevoNumero = inicio[j];
                    inicio[i] = nuevoNumero;
                    inicio[j] = anteriorNumero;
                }
            }
        }
        return inicio;
    }
}
