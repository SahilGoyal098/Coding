import java.util.Scanner;

public class methods {
    int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return(n*factorial(n-1));
        }
    }

    float sumofseries(int a){
        float sum=0.0f;
        for(int i=1;i<=a;i++){
            // int fact=factorial(i);
            sum=sum+(i/(float)factorial(i)) ;

        }
        return (sum);
    }



    public static void main(String[]args){
        methods m=new methods();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first n no. for which u want to print series");
        int series=sc.nextInt();
        System.out.println("the sum of series is"+m.sumofseries(series));
        sc.close();

    }
    
}
