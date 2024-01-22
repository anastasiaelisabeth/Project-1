import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner kb = new Scanner(System.in);

        System.out.println("Starting game");
        System.out.println("You start with 20 points in your score");
        System.out.println("Generating random number between 1 and 8");
        
        Random num = new Random();
        int rando = num.nextInt(9);
        System.out.println("Random number:" +rando);

    }
}
