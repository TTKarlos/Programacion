package Ejercicios;

public class MetodoCopiarArrayIMPORTANTE {
    public static void main(String[] args) {
        int[] arrayPrimera = {10,20,30,40,50,60};
        int[] arrayTercera = {60,50,40,30,20,10};
        copiarArray(arrayPrimera);

    }
    public static void copiarArray (int[] array1){
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
            System.out.println(array1[i]);
        }

    }
}
