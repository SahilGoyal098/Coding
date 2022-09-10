import java.util.Scanner;

public class floyds {
    void pattern(int n){
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+"\t");
                a++;
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        floyds var=new floyds();
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        var.pattern(number);
        sc.close();
    }
    
}
