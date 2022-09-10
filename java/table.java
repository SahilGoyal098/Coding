import java.util.Scanner;

public class table {

    void tables(int n,int i){
        if(i>=0 && i<=10){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
        
        else{
        return;
        }
        tables(n,i+1);
    }




    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        table tb=new table();
        System.out.println("enter no. fpr which u want to print table");
        int num=sc.nextInt();
        tb.tables(num,1);
        sc.close();


    }
    
}
