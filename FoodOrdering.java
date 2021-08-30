/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public void resLogic()
    {
        Scanner sc=new Scanner(System.in);
      System.out.println("---------------------------\n> Select from main menu:\n----------------------------\n  1)Browse by category\n 2)Search by restaurant \n 3)Checkout \n 4)Exit.");
    int menu=sc.nextInt();
    switch(menu){
        case 1:
            selectbyCategory();
        break;
    }
    }
    public void selectbyCategory()
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("---------------------------\n> Select by category:\n----------------------------\n  1)restaurant\n 2)Cafe \n 3)Fast food \n 4)Go to main menu.");
         int menu=sc.nextInt();
    switch(menu){
        case 1:
            restaurantList();
        break;
    }
    }
    public void restaurantList()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("---------------------------\n> Select from restaurant list:\n----------------------------\n  1)Moeders\n 2)Just Salads \n 3)Go to main menu");
                 int menu=sc.nextInt();
    switch(menu){
        case 1:
            moedersRestourant();
        break;
    }
        
    }
    public void saladRestaurant(){
        
    }
    public void moedersRestourant()
    {
     
        ResData data=new ResData();
                Scanner sc=new Scanner(System.in);
                
        System.out.println("---------------------------\n> Select a food item from Moeders R:\n----------------------------\n1)Lobster Soup-  $25.00,\n2)Fish of the Day-$22.00,\n3)Mommy's Apple Pie-$8.00,\n4)Irish Coffee-$4.50");
                 int menu=sc.nextInt();
    switch(menu){
        case 1:
           System.out.println("You are buying Lobster Soup");
          data.setFoodPrize(25);
          data.setDeliveryFee(10);
           this.moedersRestourant();
           
        break;
        case 2:
           System.out.println("You are buying Fish of the day");
        break;
    }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Main m=new Main();
		m.resLogic();
	}
	
	class ResData
	{
	    private int totalPrize=0;
	  private int deliveryFee=0;
	   private  int foodPrize=0;
	   private ArrayList <Integer> prize;
	   public ArrayList getPrizes()
	   {
	       return this.prize;
	   }
	   public void setPrize(ArrayList <Integer> list)
	   {
	       this.prize=list;
	   }
	    public int getTotalPrize()
	    {
	        
	       return this.totalPrize; 
	    }
	    
	    public void setTotalPrize(int prize)
	    {
	        
	       this.totalPrize=this.getPrizes.stream()
            .mapToLong(Integer::longValue)
            .sum(); 
	       
	    }
	    public int getDeliveryFee()
	    {
	       return this.deliveryFee; 
	    }
	    
	    public void setDeliveryFee(int deliveryFee)
	    {
	       this.deliveryFee=deliveryFee; 
	    }
	    public int getFoodPrize()
	    {
	       return this.foodPrize; 
	    }
	    
	    public void setFoodPrize(int foodPrize)
	    {
	       this.foodPrize=foodPrize; 
	    }
	}
}
