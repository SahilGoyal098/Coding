import java.util.Scanner;

public class maximum {
    void max(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("the maximun no.is "+a);

        }
        else if(b>a && b>c){
            System.out.println("the maximun no.is "+b);
        }
        else{
            System.out.println("the maximun no.is "+c);
        }

    }

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        maximum var=new maximum();
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        System.out.println("enter third number");
        int num3=sc.nextInt();
        var.max(num1,num2,num3);
        sc.close();
    }
    
}
