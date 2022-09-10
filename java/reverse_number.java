import java.util.Scanner;

public class reverse_number {
    void newnumber(int a){
        while(a!=0){
            int d=a%10;
            System.out.print(d);
            a=a/10;
        }

    }


    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        reverse_number var=new reverse_number();
        System.out.println("enter no.u want to insert");
        int number=sc.nextInt();
        System.out.println("your original no. is"+number);
        System.out.println("the reversed no.is");
        var.newnumber(number);
        sc.close();
    }
    
}
