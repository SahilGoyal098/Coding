import java.util.Scanner;

public class prime {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter number u want to check whether it is prime or not");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;

            }
        }
        if(count==2){
            System.out.println("yes it is a prime number");
        }
        else{
            System.out.println("not prime nummber");
        }
    

    }
    


}
