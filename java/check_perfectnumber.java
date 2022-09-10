import java.util.Scanner;

public class check_perfectnumber {
    void check(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;           
            }
            


        }
        if(sum==n){
            System.out.println("no.is perfect number");
        }
        else{
            System.out.println("not perfect no.");
        }

    }

    public static void main (String[]args){
        check_perfectnumber var=new check_perfectnumber();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no. u want to check whether it is perfect no. or not");
        int number=sc.nextInt();
        var.check(number);
        sc.close();

    }
    
}
