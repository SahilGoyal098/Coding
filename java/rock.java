import java.util.Scanner;
import java.util.Random;

public class rock {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("WElcome to rock paper scissor game");
        System.out.println("press 1 for rock");
        System.out.println("press 2 for paper");
        System.out.println("press 3 for scissors");

        Random rand=new Random();
        int your_choice=sc.nextInt();
        int comp_choice=rand.nextInt(1,4);
        System.out.println(comp_choice);
        if(comp_choice==1 && your_choice==1){
            System.out.println("game tie try again");
        }
        else if(comp_choice==1 && your_choice==2){
            System.out.println("you win");
        }
        else if(comp_choice==1 && your_choice==3){
            System.out.println("comp win");
        }
       
        else if(comp_choice==2 && your_choice==2){
            System.out.println("game tie tey again");
        }
        else if(comp_choice==2 && your_choice==1){
            System.out.println("comp win");
        }
        else if(comp_choice==2 && your_choice==3){
            System.out.println("you win");
        }
        else if(comp_choice==3 && your_choice==2){
            System.out.println("comp win");
        }
        else if(comp_choice==3 && your_choice==1){
            System.out.println("you win");
        }
        else if(comp_choice==3 && your_choice==3){
            System.out.println("game tie try again");
        }
        else{
            System.out.println("enter wrong no.");
        }



        sc.close();
        
    }
    
}
