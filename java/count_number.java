import java.util.Scanner;

public class count_number {
   static int count_digit(long a,int b){
        int count=0;
        while(a!=0){
           long d=a%10;
            if(d==b){
                count++;
            }
            a=a/10;
        }
        return(count);
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.");
        long number=sc.nextInt();
        System.out.println("enter digit u want to count in that number");
        int digit=sc.nextInt();
        System.out.println("the digit come in number is"+count_digit(number,digit)+"times");
        sc.close();

        
    }
    
}
