package Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Clinica {
    public static final int NUMEROS_DE_SALAS = 10;
    public static final int OPCION_SALIR = -1;
    public static final int CANTIDAD_DE_CLIENTES_VALIDA = 4;
    public static final int CLIENTES_NO_ADMITIDOS = 0;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int[] salasGeneradas = generarSalas(NUMEROS_DE_SALAS);
        int pedirNumero;
    do {
    mostrarOcupacion(salasGeneradas);
    pedirNumero =pedirNumeroClientes();
    if (pedirNumero > 5){
        System.out.println("Lo siento. No admitimos grupos tan grandes. Introduzca un nuevo número de clientes");
    } else if (pedirNumero <= 0 && pedirNumero != -1) {
        System.out.println("Lo siento. La reserva sólo se puede hacer entre 1 y 4 personas. Introduzca un nuevo número de clientes");
    }else {
        ubicarAClientes(salasGeneradas, pedirNumero);
    }

    }while ( pedirNumero != -1);
        System.out.println("Adios");



    }

    public static int[] generarSalas(int tamanyo){
        Random generarOcupacion = new Random();
        int[] salasVacias = new int[tamanyo];
        for (int i = 0; i < salasVacias.length ; i++) {
            int random = generarOcupacion.nextInt(9);
            salasVacias[i] = random;
        }
        return salasVacias;
    }

    public static void mostrarOcupacion(int[] estadoSalas){
        int[] salas = new int[NUMEROS_DE_SALAS];
        int numeroSala = 1;
        for (int i = 0; i < salas.length; i++) {
            salas[i] = numeroSala;
            numeroSala ++;
        }
            System.out.print("+---------+");
            for (int i = 0; i < salas.length; i++) {
                System.out.print("-----+");
            }
            System.out.print("\n| " + "Sala nº"+ " | ");
            for (int i = 0; i < salas.length; i++) {
                System.out.print(salas[i] + "  |  ");
            }

            System.out.print("\n+---------+");

            for (int i = 0; i < estadoSalas.length; i++) {
                System.out.print("-----+");
            }
            System.out.print("\n|" + "Ocupación"+ "| ");
            for (int i = 0; i < estadoSalas.length; i++) {
                System.out.print(estadoSalas[i] + "  |  ");
            }

            System.out.print("\n+---------+");

            for (int i = 0; i < salas.length; i++) {
                System.out.print("-----+");
            }



    }
    public static int pedirNumeroClientes() {
        int numeroClientes;
            System.out.print("\n¿Cuántos son? [1-4](Introduzca -1 para salir del programa): ");
            numeroClientes = teclado.nextInt();
        return numeroClientes;
        }

        public static int ubicarAClientes (int[] estadoSalas, int numeroCLientes) {

                for (int contSala = 0; contSala < estadoSalas.length; contSala++) {

                        if (estadoSalas[contSala] + numeroCLientes <= 10){

                            estadoSalas[contSala] += numeroCLientes;
                            if (estadoSalas[contSala] == numeroCLientes){
                                System.out.println("Por favor, acudan a la sala número " + (contSala + 1));
                            }else {
                                System.out.println("Tendrán que compartir sala con otros clientes. Por favor, acudan a la sala número " + (contSala + 1));
                            }
                            return contSala;
                        }
                    }


            System.out.println("No queda hueco para vosotros. Deberéis volver otro día");
            return -1;
        }
    }


