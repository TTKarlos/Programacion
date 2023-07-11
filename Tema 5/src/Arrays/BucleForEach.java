package Arrays;

public class BucleForEach {
    public static void main(String[] args) {
        String[] nombres = {"alex","karlos","Imane", "Ivan"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        for(String i:nombres){
            System.out.println("Nombres: " + i);
        }
    }
}
