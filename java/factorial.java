import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of which u want to calculate factorial");
        int n=sc.nextInt();
        int product=1;
        for(int i=1;i<=n;i++){
            product=product*i;
        }
        System.out.printf("the factorial of %d is %d",n,product);
        sc.close();



    }
    
}
