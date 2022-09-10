import java.util.Scanner;

public class sum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float[]marks=new float[5];
        float sum=0.0f;
        for(int i=0;i<5;i++){
            System.out.printf("the value of marks[%d] is\n",i);
            marks[i]=sc.nextFloat();
        }
        for(int j=0;j<5;j++){
            sum=sum+marks[j];

        }
        System.out.println("the sum of element of aray is"+sum);
        sc.close();


    }
    
}
