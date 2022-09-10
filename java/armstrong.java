import java.util.Scanner;

public class armstrong {
    int count_digit(int n){
        int count=0;
        while(n!=0){
            
            count++;
            n=n/10;
            
        }
        return(count);
        

    }


    void check_armstrong(int number){
        int number_of_digit=count_digit(number);
        int a=number;
        double sum=0;
        while(number!=0){
            int d=number%10;
            sum=sum+Math.pow(d,number_of_digit);
            number=number/10;
        }

        if(sum==a){
            System.out.println("it is a armstrong number");
        }
        else{
            System.out.println("it is not a armstrong number");
        }

    }



    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        armstrong var=new armstrong();
        System.out.println("enter your no.u want to check");
        int choice=sc.nextInt();
        var.check_armstrong(choice);
        sc.close();
        
        
    }
    
}
