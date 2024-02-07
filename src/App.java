import java.util.Random;
import java.util.Scanner;


public class App {

static int[] loss(int size){
    int fält[] = new int[size];
    for(int i = 0; i<size; i++){
        fält[i] = i;
    }
    return fält;
}
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner kb = new Scanner(System.in);

        int score = 20;
        int score2 = 20;

        System.out.println("Starting game");
        kb.nextLine();
        System.out.println("You start with 20 points in your score");
        kb.nextLine();
        System.out.println("Generating random number between 0 and 8");
        kb.nextLine();
        
while (score>0 && score2>0) {

    Random rando = new Random();
        int  num1 = rando.nextInt(9);
        System.out.println("Your number:" +num1);

        Random rando2 = new Random();
        int num2 = rando2.nextInt(9);
    

        switch (num1) {
            case 0:
                System.out.println("You Lost");
                score--;
                kb.nextLine();
                System.out.println("You have "+score+" points");
                break;
        
            default:
                System.out.println("Generating random number for bot");
                System.out.println("Opponent number:" +num2);
                kb.nextLine();
                break; 
                }

                int diff = num1-num2;

        if (diff<1) {
                    System.out.println("You Lost");
                    score--;
                    kb.nextLine();
                    System.out.println("You have "+score+" points");
                    System.out.println("Your opponent has " +score2+" points");
                    kb.nextLine();
                }
                else{
                    System.out.println("You WIN");
                    score2--;
                    kb.nextLine();
                    System.out.println("You have "+score+" points");
                    System.out.println("Your opponent has " +score2+" points");
                    kb.nextLine();
                    }
                    
        }
        if (score2<1) {

            System.out.println("WINNER");
            
        }

        if (score<1) {

            int[] fält = loss(500);
            
        }
    } 
}


