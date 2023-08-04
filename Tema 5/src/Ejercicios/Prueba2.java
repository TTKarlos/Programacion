package Ejercicios;


    import java.util.Map;
import java.util.Random;
import java.util.Scanner;

    public class Prueba2 {
        public static final int NUMERO_DE_SALAS = 10;
        public static final int PERSONAS_POR_SALA = 9;
        public static final int MAXIMO_PERSONAS_POR_SALA = 10;
        public static final int OPCION_SALIR = -1;
        public static final int CANTIDAD_DE_CLIENTES_VALIDA = 4;
        public static final int CLIENTES_NO_ADMITIDOS = 0;
        static Scanner teclado = new Scanner(System.in);

        public static void main(String[] args) {
            int[] generarSalasRandoms = generarSalas(NUMERO_DE_SALAS);
            mostrarEstadoOcupacion(generarSalasRandoms);
            int pedirNumero;
            do {
                pedirNumero = pedirNumeroClientes();
                int ubicar = ubicarAClientes(generarSalasRandoms, pedirNumero);
                if (pedirNumero == OPCION_SALIR){
                    System.out.println("Adiós");
                    return;
                }
                if (pedirNumero > CANTIDAD_DE_CLIENTES_VALIDA){
                    System.out.print("Lo siento. No admitimos grupos tan grandes. Introduzca un nuevo número de clientes\n");

                }else if (pedirNumero <= CLIENTES_NO_ADMITIDOS){
                    System.out.print("Lo siento. La reserva sólo se puede hacer entre 1 y 4 personas.Introduzca un nuevo número de clientes\n");
                }else {
                    System.out.println("Por favor, acuda a la sala número " + ubicar);
                }
                mostrarEstadoOcupacion(generarSalasRandoms);
            }while (true);

        }

        public static int[] generarSalas(int tamany){
            Random generarOcupacion = new Random();
            int[] salasVacias = new int[tamany];
            for (int i = 0; i < salasVacias.length ; i++) {
                int random = generarOcupacion.nextInt(PERSONAS_POR_SALA);
                salasVacias[i] = random;
            }
            return salasVacias;
        }

        public static void mostrarEstadoOcupacion(int[] estadoSalas) {
            System.out.print("╔");
            for (int i = 0; i < estadoSalas.length; i++) {
                System.out.print("═════════");
            }
            System.out.println("╗");

            int salas = 1;
            for (int i = 0; i < estadoSalas.length; i++) {
                System.out.printf("║ Sala %d ", salas);
                salas++;
            }
            System.out.println("║");
            System.out.print("║");
            for (int i = 0; i < estadoSalas.length; i++) {
                System.out.print("═════════");
            }
            System.out.println("║");
            System.out.print("║");

            for (int cantidadPacientes : estadoSalas) {
                if (cantidadPacientes >= MAXIMO_PERSONAS_POR_SALA) {
                    System.out.print("  " +cantidadPacientes + "   ");
                }else {
                    System.out.print("    " + cantidadPacientes + "    ");
                }
            }


            System.out.print("║");
            System.out.print("\n╚");
            for (int i = 0; i < estadoSalas.length; i++) {
                System.out.print("═════════");
            }
            System.out.print("╝");

        }

        public static int pedirNumeroClientes() {
            do {
                System.out.print("\nCuántos son? [1-4] (Introduzca -1 para salir del programa): ");
                if (teclado.hasNextInt()){
                    return teclado.nextInt();
                }else {
                    System.out.print("No entiendo tu respuesta. Introduzca un nuevo número de clientes");
                    teclado.next();
                }
            }while (true);
        }

        public static int ubicarAClientes(int[] estadoSalas, int numeroClientes) {
            if (numeroClientes >= 1 && numeroClientes <= 4){
                for (int i = 0; i < estadoSalas.length; i++) {
                    if (estadoSalas[i] == 0){
                        estadoSalas[i] = numeroClientes;
                        return i +1;
                    }
                }
                int sala = -1;
                int totalSalas = 0;
                for (int i = 0; i < estadoSalas.length; i++) {
                    int totalNuevo = estadoSalas[i] + numeroClientes;
                    if (totalNuevo <= MAXIMO_PERSONAS_POR_SALA && totalNuevo > totalSalas){
                        totalSalas = totalNuevo;
                        sala = i;
                    }
                }
                estadoSalas[sala] += numeroClientes;
                return sala +1;
            }return -1;
        }

    }



