/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
boolean play = true;
    String input1;

    while(play == true){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int counter = 0;
        int guess = -1;
        int dif = 0;
        int m;
        int r_no;
   Random r=new Random();
           System.out.println("Enter the upper Bound");
            int a=input.nextInt();
      
    r_no=1+r.nextInt(a);
        int easy = rand.nextInt(100) + 1, med = rand.nextInt(500) + 1, hard = rand.nextInt(1000) + 1; 
         System.out.println("Choose difficulty");

        System.out.println("=================");
        System.out.print("1) Easy   2) Medium   3) Hard     :");
        System.out.print("Enter Level");
        int entered=input.nextInt();
        
        switch(entered){
            case 1:
                System.out.println("Easy");
                m=r_no/2;
                break;
            case 2:
                System.out.println("You are playing Medium");
                m=r_no/3;
                break;
             case 3:
                 System.out.println("You are playing Hard");
                 m=r_no/4;
                 break;
            default:
            System.out.println("Invalid choice");
                       
break;
        }

        
        int number = 1 + (int)(100
                               * Math.random());
  
        // Given K trials
        int K = r_no/2;
  
        int i;
          for (i = 0; i < K; i++) {
  
            System.out.println(
                "Guess the number:");
  
            // Take input for guessing
            guess = input.nextInt();
  
            // If the number is guessed
            if (r_no== guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                break;
            }
                      else if (r_no> guess) {
                System.out.println(
                    "The number is greater your number");
                break;
            }
                 else if (r_no< guess) {
                System.out.println(
                    "The number is less your guess");
                break;
            }
            else if (r_no!= guess) {
                System.out.println("The number is not equal, Please retry");
            }
    
                    if (i == K) {
            System.out.println(
                "You have exhausted"
                + " K trials.");
  
            System.out.println(
                "The number was " + r_no);
        }
        }
  

        System.out.println ("It took you " + counter + " guess(es) to get it correct"); 
        System.out.print ("Do you want to play again? (y/n): ");
        
        input1 = input.nextLine();  // absorb enter key from integer
        input1 = input.nextLine();

        if (input1.equals("y"))
           play = true;
        else if(input1.equals("n"))
        {
           play = false;
           System.out.print ("Thank you for Playing the game");
        }
else{
    System.out.print ("Thank you for Playing the game");
}
            }
        }
        public static int getRandomInteger(int maximum, int minimum){ return ((int) (Math.random()*(maximum - minimum))) + minimum; }

String dificulty;
switch(difficulty)
{
    case easy
}
}
