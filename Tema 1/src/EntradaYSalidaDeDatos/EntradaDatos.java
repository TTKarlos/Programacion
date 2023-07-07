package EntradaYSalidaDeDatos;

import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Inserta un numero: ");
        numero = teclado.nextInt();
        System.out.println("El numero es: " + numero);

        float decimal;
        System.out.println("Esccribe un numero decimal: ");
        decimal = teclado.nextFloat();
        System.out.println("El numero decimal es: " + decimal);

        String cadena;
        System.out.println("Escribe una frase: ");
        cadena = teclado.next();
        System.out.println("La cadena es: " + cadena);

        /* Con el nextLine guardamos la cena enter sin el line
        solo guardamos la cadena hasta el primer espacio */
        System.out.println("Escribe una frase: ");
        String cadena2 = teclado.nextLine();
        System.out.println("La cadena es: " + cadena2);

        /* El charAt nos permite guardar el
        numero donde esta la letra */
        char letra;
        System.out.println("Escribe una letra: ");
        letra = teclado.next().charAt(0);
        System.out.println("La letra es: " + letra);



    }

}
