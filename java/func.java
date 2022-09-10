import java.util.Scanner;

public class func {
    // u can use static then dont use to make  obj

      int factorial (int n){   
        if(n==0 || n==1){
            return 1;
        }
        else{
            return(n*factorial(n-1));
        }

    }
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        func obj=new func();
        System.out.println("enter no.u want to calculate factorial");
        int a=sc.nextInt();
        System.out.println("the factorial of n is "+obj.factorial(a));
        sc.close();



    }
    
    
}
