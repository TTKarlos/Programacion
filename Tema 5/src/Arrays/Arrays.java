package Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        numeros[0] = 5;
        numeros[1] = 6;
        numeros[2] = 7;

        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }

        int[] numeros2 = {5,6,7};

        for (int i = 0; i < 3; i++) {
            System.out.println(numeros2[i]);
        }

    }
}
