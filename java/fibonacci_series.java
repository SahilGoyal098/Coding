import java.util.Scanner;


public class fibonacci_series {
    int fibonacci(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return(fibonacci(n-2)+fibonacci(n-1));
        }
    }
    public static void main(String[]args){
        fibonacci_series fibo=new fibonacci_series();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no.of series u want to print");
        int number=sc.nextInt();
        for(int i=0;i<number;i++){
            System.out.printf("fibonacci[%d]=%d",i,fibo.fibonacci(i));
            System.out.println();
        }


        sc.close();


    }
    
}
