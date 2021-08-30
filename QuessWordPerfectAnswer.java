import java.util.*;
import java.lang.*;
public class Main
{
    public void newGame()
    {
        Game game=new Game();
	    Scanner input=new Scanner(System.in);
        System.out.println("enter the upperbound:");
        int upperbound=input.nextInt();
        game.setUpperBound(upperbound);
        game.generateRandom();
        System.out.println("Choose the difficulty level i.e \n1: For easy\n2: For Difficult");
        int opt=input.nextInt();
        switch(opt)
        {
            case 1:
                game.setLevel(1);
                System.out.println("guess the Number");
                int number=input.nextInt();
                game.match(number);
                game.incrimentTrials();
                System.out.println(game.comment());
                while(!game.isOver())
                {
                    
                        System.out.println("guess the Number");
                        number=input.nextInt();
                        game.match(number);
                        game.incrimentTrials();
                        System.out.println(game.comment());
                        if(game.won())
                        {
                          System.out.println("Your No of trials:\t"+game.getTrials());
                          System.out.println("The number was:\t"+game.getRandom());
                          System.out.println("\n\nDo you wish to replay \n1: yes\n2: No");
                            opt=input.nextInt();
                            switch(opt)
                                {
                                    case 1:
                                        this.newGame();
                                    case 2:
                                        System.exit(0);
                                    default:
                                         System.out.println("wrong choiche !!!!");
                                         break;
                                }
                        }
              
                    
                }
                 System.out.println("Your No of trials:\t"+game.getTrials());
                          System.out.println("The number was:\t"+game.getRandom());
                          System.out.println("You have lost the game");
                             System.out.println("\n\nDo you wish to replay \n1: yes\n2: No");
                            String m=input.nextLine();
                            switch(m)
                                {
                                    case "y":
                                        this.newGame();
                                    case "n":
                                        System.exit(0);
                                    default:
                                         System.out.println("wrong choiche !!!!");
                                         break;
                                }
                        
                         
                break;
            case 2:
                 game.setLevel(2);
                 game.initializeCount();
                System.out.println("guess the Number");
                number=input.nextInt();
                game.match(number);
                game.incrimentTrials();
                System.out.println(game.comment());
                System.out.println("count: "+game.getCount());
                 while(!game.isOver())
                {
                  
                        System.out.println("guess the Number");
                        number=input.nextInt();
                        game.match(number);
                        game.incrimentTrials();
                        System.out.println("count: "+game.getCount());
                        System.out.println(game.comment());
                        if(game.won())
                        {
                          System.out.println("Your No of trials:\t"+game.maxGuesses());
                          System.out.println("The number was:\t"+game.getRandom());
                          System.out.println("\n\nDo you wish to replay \n1: yes\n2: No");
                            String choice=input.nextLine();
                            switch(choice) 
                                {
                                    case "y":
                                        this.newGame();
                                    case "n":
                                        System.exit(0);
                                }
                        }
                    
         
                        
                    }
                                System.out.println("Your No of trials:\t"+game.maxGuesses());
                          System.out.println("The number was:\t"+game.getRandom());
                          System.out.println("You have lost the game");
                             System.out.println("\n\nDo you wish to replay \n1: yes\n2: No");
                            int y=input.nextInt();
                          switch(y)
                                {
                                    case 1:
                                        this.newGame();
                                        break;
                                    case 2:
                                        System.exit(0);
                                        break;
                                    default:
                                     System.out.println("wrong choiche !!!!");
                                     break;
                                }
                }
     
              
                
        }
    
 
	public static void main(String[] args) {
	  new Main().newGame();
	}
}

  enum Choice{
       Y,N
   }
 class Game{
        private int upperbound;
        private int level;
        private int trials=0;
        private int maxGuesses=0;
        private int count;
        private int random;
        private int guess;
        private boolean won;
        public  Game()
        {
            System.out.println("welcome to the game");
        }
        public void setUpperBound(int upperbound)
        {
            this.upperbound=upperbound;
        }
        public int getRandom()
        {
            return this.random;
        }
        public void generateRandom()
        {  
            Random rand=new Random();
            if(this.upperbound<10)
            {
               this.random =rand.nextInt(10);
            }
            else{
                this.random=rand.nextInt(this.upperbound);
            }
	        
        }
        public void setLevel(int level)
        {
            this.level=level;
        }
        public void incrimentTrials()
        {  
            if(this.level==1){
                this.trials+=1;
                
            }
                else
                {
                    this.maxGuesses+=1;
                    this.count=this.count/2;
                }
            
        }
        public int getTrials()
        {
            return this.trials;
        }
         public int maxGuesses()
        {
            return this.maxGuesses;
        }
        public void initializeCount()
        {
            this.count=this.upperbound;
        }
        public int getCount()
        {
            return this.count;
        }
        public boolean isOver()
        {
            if(this.level==1)
            {
                int maxTrials=Math.round(this.upperbound/2);
                return maxTrials<=this.trials;
            }
            else{
               return this.count<=0;
            }
        }
        public void match(int guess)
        {
            this.guess=guess;
            this.won=(guess==this.random);
        }
        public boolean won()
        {
            return this.won;
        }
        public String comment()
        {
           if(won)
           {
               return "you have won the game";
           }
           else if(this.guess>this.random)
           {
               return "the number is too high";
           }
           else{
               return "the number is too low";
           }
            //return "";
            //if()
        }
        
    }