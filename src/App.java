import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner kb = new Scanner(System.in);

        int score = 20;

        System.out.println("Starting game");
        kb.nextLine();
        System.out.println("You start with 20 points in your score");
        kb.nextLine();
        System.out.println("Generating random number between 0 and 8");
        kb.nextLine();
        
        Random rando = new Random();
        int  num1 = rando.nextInt(9);
        System.out.println("Random number:" +num1);

        Random rando2 = new Random();
                int num2 = rando2.nextInt(9);


while (score>0) {
    

        switch (num1) {
            case 0:
                System.out.println("You Lost");
                score--;
                kb.nextLine();
                System.out.println("You have "+score+" points");
                break;
        
            default:
                System.out.println("Generating random number for bot");
                kb.nextLine();

                System.out.println("Random number:" +num2);
                break; 
            }

                int diff = num1-num2;

                if (diff<0) {
                    System.out.println("You Lost");
                    score--;
                    kb.nextLine();
                    System.out.println("You hav"+score+"points");
                }
                else{
                    System.out.println("You WIN");
                    score++;
                    kb.nextLine();
                    System.out.println("You have"+score+"points");
                        break;
                    }
                    
                    
            
        }



    } 
}


