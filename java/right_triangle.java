import java.util.Scanner;


public class right_triangle {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        if(x*x+y*y==z*z || y*y+z*z==x*x || x*x+z*z==y*y){
            System.out.println("yes it is right angled triangle");
        }
        else{
            System.out.println("it is not right angle triangle");
        }
        sc.close();
    }
    
}
