import java.util.Scanner;

public class max {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int max=0;
        int []array=new int[6];
        for(int i=0;i<array.length;i++){
            System.out.printf("the value of array[%d] is\n",i);
            array[i]=sc.nextInt();
        }
        for(int j=0;j<array.length;j++){
            if(array[j]>max){
                max=array[j];
            }
        }
        System.out.println("the max element in array is "+ max);
        sc.close();
        


    }
}
