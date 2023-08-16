package MetodosYBusquedas;

import java.util.Scanner;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = {60,30,10,40,20};
        boolean seHaEncontrado = false;
        System.out.println("Escribe el numero que quieres buscar: ");
        int valorABuscar = teclado.nextInt();
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorABuscar){
                seHaEncontrado = true;
                contador = i;

            }


        }
        if (seHaEncontrado == false) {
            System.out.println("El numero no se ha encontrado");
        }else {
            System.out.println("El numero ha sido encontrado, en la posicion: " + contador);
        }

    }
}
