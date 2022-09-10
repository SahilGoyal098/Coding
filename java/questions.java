import java.util.Scanner;

public class questions {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float exp;
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        System.out.println("enter the value of c");
        c=sc.nextInt();
        exp=a/(float)(b-c);
        System.out.println("the value of x is"+exp);
        sc.close();


    }
}
