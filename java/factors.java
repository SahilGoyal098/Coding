import java.util.Scanner; 

public class factors {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no.");
        int n=sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+"\t" );
            }
        }
        System.out.println(n);
        sc.close();

    }
    
}