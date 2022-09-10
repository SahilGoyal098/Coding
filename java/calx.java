import java.util.Scanner;
public class calx {
    static void addition(int a,String n,int b){
        System.out.println("sum of "+a +"+"+b+ "is"+(a+b));

    }

    static int multiply(int a,int b){
        return(a*b);
    }

    static float division(int a,int b){
        return((float)a/b);
    }
    static int subtraction (int a,int b){
        return(a-b);

    }

    public static void main(String[]args){
        addition(20,"+",30);

    }
    
}
