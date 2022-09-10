import java.util.Scanner;

public class loops {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ener your age");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("you can drive");

        }
        else if(age<18 && age>=16){
            System.out.println("trying to drive");
        }
        else{
            System.out.println("cannot drive car under age");
        }

        sc.close();



    }
    
}
