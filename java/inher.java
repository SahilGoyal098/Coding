import java.util.Scanner;

class vehicle{

    int no_of_tyre=2;
    String color="black";

    void max(String n,int speed){
        System.out.println("the max speed of a"+n+"is"+speed);
    }

    void milage(int a){
        System.out.println("the milage is"+a);
    }

    public vehicle(){
        System.out.println(" i am constructor of parent class");
    }

    public vehicle(int a,int b){
        System.out.println("the multiplication of twr given number is"+a*b);
    }



}

class Rangerover extends vehicle{
    int cost;
    String name;
    @Override
    void max(String b,int max){
        
        System.out.println("the max speed of hh"+b+"is"+max);
    }

    public Rangerover(){
        
        System.out.println(" i am constructor of child class");
    }
    public Rangerover(int c ,int d){
        super(c,d);
        System.out.println("the sum of two given no .is"+(c+d));
    }

    public Rangerover(String l,int d){
        cost=d;
        name=l;
    }
    void sum(){
        System.out.println("hello");
    }
        
        



    






}


public class inher {
    public static void main(String[]args){
        // Scanner sc=new Scanner(System.in);
        vehicle var=new Rangerover();//using this only we can call parent class method but in case of over riding then it call child method
        var.sum();// not callable
        // Rangerover var1=new Rangerover("alto",4);
        // System.out.println(var1.cost);
        // var.max("fortuner",200);
        // var1.max("my car",230);
        

    }
    
}
