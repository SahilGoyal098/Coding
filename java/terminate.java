import java.util.Scanner;

public class terminate {

    public static void main(String[]args){

        Scanner sc=new Scanner (System.in);
        System.out.println("enter total no.of integer u want to add");
        int number=sc.nextInt();
        int sum=0;
        int x;
        for(int i=0;i<=number;i++){
            x=sc.nextInt();
            if(x==0){
                break;
            }
            sum=sum+x;
        }
        System.out.println("the sum of integers is "+sum);


        
        sc.close();

    }
    
}
