import java.util.Scanner;
import java.lang.Math;

public class pattern2 {

    static void StarPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0+i;j<n;j++){
                System.out.print("*\t");

            }
            System.out.println();
        }
    }

    static void starpattern2(int a){
        for(int i=1;i<=a;i++){
            for(int b=a;b>i-1;b--){
                System.out.print(" ");
            }
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            for(int k=i-1;k>0;k--){
                System.out.print(k);
            }
            System.out.println();

        }
    }

    static void starpattern3(int b){
        for(int i=1;i<=b;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int j=0;j<b-2;j++){
            System.out.print("*");
            for(int k=0;k<b-2;k++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int m=1;m<=b;m++){
            System.out.print("*");
        }
    }

    static void starpattern4(int c){
        for(int i=1;i<=c;i++){
            System.out.print(" ");

        }
        System.out.print("*");
        System.out.println();
        for(int j=0;j<c-2;j++){
            for(int k=c-1;k>j;k--){
                System.out.print(" ");

            }
            System.out.print("*");
            if(j==0){
                System.out.print(" ");
            }
            else{
                for(int m=0;m<(Math.pow(2,j))+1;m++){
                    System.out.print(" ");
    
                }
            }
        
           
            
        
            
            System.out.print("*");
            System.out.println();

            }
            System.out.print(" ");
            for(int l=0;l<c;l++){
                System.out.print("*");
                System.out.print(" ");
            }
        }

    

    
    

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur no to print series");
        int num=sc.nextInt();
        // StarPattern(num);
        // starpattern2(num);
        // starpattern3(num);
        starpattern4(num);
        sc.close();


    }
 
}
