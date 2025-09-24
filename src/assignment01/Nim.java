import java.util.Random;
import java.util.Scanner;

public class Nim {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter initial number of sticks: ");
        int stickLeft = in.nextInt();
        int round = 0;
        Random rand = new Random();

        //Round 0: 7 at start human takes 2, so 5 remain
        //Round 1: 5 at start computer takes 2, so 3 remain
        //Round 2: 3 at start human takes 2, so 1 remain
        //Round 3: 1 at start computer takes 1, so 0 remain
        //The computer wins / you lose!

        while(stickLeft>0){
 
            System.out.print("You take 1 or 2 sticks?");
            int playerTake = in.nextInt();

            if (playerTake <=2 && playerTake >=1){
                System.out.print("Round " + round + ": " + stickLeft + " at start ");
                stickLeft -= playerTake;
                System.out.println("human takes " + playerTake + " , so " + stickLeft + " remain");
            round++;
            }
            else{
                System.out.println("Invalid input");
            }
           
            if(stickLeft == 0){
                System.out.println("You win!");
            }

            else if (stickLeft > 2) {
                int computerTake = (rand.nextInt(2) + 1);  // 随机取 1 或 2
                System.out.print("Round " + round + ": " + stickLeft + " at start ");
                stickLeft -= computerTake;
                System.out.println("computer takes " + computerTake + " , so " + stickLeft + " remain");
            round++;
            }
            else if(stickLeft == 2){
                int computerTake = 2;
                System.out.print("Round " + round + ": " + stickLeft + " at start ");
                stickLeft -= 2;
                System.out.println("computer takes " + computerTake + " , so " + stickLeft + " remain");
                System.out.println("The computer wins!");
            }
            else if(stickLeft == 1){
                int computerTake = 1;
                System.out.print("Round " + round + ": " + stickLeft + " at start ");
                stickLeft -= 1;
                System.out.println("computer takes " + computerTake + " , so " + stickLeft + " remain");
                System.out.println("The computer wins!");
            }  
        
        }

    }
}
