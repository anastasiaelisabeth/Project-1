import java.util.Random;
import java.util.Scanner;


public class App {

static String[] loss(int size){
    String fält[] = new String[size];
    for(int i = 0; i<size; i++){
        fält[i]="LOOSER ";
    }
    return fält;
}
    public static void main(String[] args) throws Exception {

        int round = 1;
        System.out.println("Hello, World!");

        Scanner kb = new Scanner(System.in);

        int score = 20;
        int score2 = 20;
//Menyn innan spelstart med info inför spelet
        System.out.println("Starting game");
        kb.nextLine();
        System.out.println("You start with 20 points in your score");
        kb.nextLine();
        System.out.println("Click enter for every round");
        kb.nextLine();
        System.out.println("Try to get your opponents score to 0");
        kb.nextLine();
        System.out.println("Your number and the opponents number are generated randomly");
        kb.nextLine();
        System.out.println("Rolling dice, number between 0 and 8");
        kb.nextLine();
        //Medans poängen av spelaren och motråndaren är över 0
while (score>0 && score2>0) {
    System.out.println("Starting round "+ round);
        kb.nextLine();
        round++;
       //Genererar random taler för spelaren
    Random rando = new Random();
        int  num1 = rando.nextInt(9);
        System.out.println("Your number:" +num1);
      //Genererar random tal för motstånd
        Random rando2 = new Random();
        int num2 = rando2.nextInt(9);
    

        switch (num1) {
            //Random numret är lika med 0 
            case 0:
                break;
            
            //Om random numret är över 0 genereras ett random tal till motståndet
            default:
                System.out.println("Generating random number for bot");
                System.out.println("Opponent number:" +num2);
                kb.nextLine();
                break; 
                }

                int diff = num1-num2;
             //När motståndets tal är större än spelarens
        if (diff<1) {
                    System.out.println("You Lost");
                    score--;
                    kb.nextLine();
                    System.out.println("You have "+score+" points");
                    System.out.println("Your opponent has " +score2+" points");
                    kb.nextLine();
                }
                //Spelarens tal är större än motståndet
                else{
                    System.out.println("You WIN");
                    score2--;
                    kb.nextLine();
                    System.out.println("You have "+score+" points");
                    System.out.println("Your opponent has " +score2+" points");
                    kb.nextLine();
                    }
                    
        }
        //När motståndets score är 0
        if (score2<1) {

            System.out.println("__        _____ _   _ _   _ _____ ____  \r\n" + //
                    "\\ \\      / /_ _| \\ | | \\ | | ____|  _ \\ \r\n" + //
                    " \\ \\ /\\ / / | ||  \\| |  \\| |  _| | |_) |\r\n" + //
                    "  \\ V  V /  | || |\\  | |\\  | |___|  _ < \r\n" + //
                    "   \\_/\\_/  |___|_| \\_|_| \\_|_____|_| \\_\\");
            
        }
        //När spelarens tal är 0
        //Skriver ut 50k LOOSER över hela skärmen
        if (score<1) {

            int size;
            String[] fält = loss(50000);
            for(int i = 0; i<fält.length; i++)
            {
                System.out.print(fält[i]);
            }
            
            
        }
    } 
}