import java.util.Scanner;

public class reverse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float[]arr=new float[5];
        for(int i=0;i<arr.length;i++){
            System.out.printf("the arr[%d] is\n",i);
            arr[i]=sc.nextFloat();

        }

        for(int j=0;j<(arr.length)/2;j++){
            float temp=arr[j];
            arr[j]=arr[arr.length-j-1];
            arr[arr.length-j-1]=temp;


        }
        System.out.println("the reverse array is ");
        for(int k=0;k<arr.length;k++){
            System.out.printf("arr[%d] is %f\n",k,arr[k]);
        }
        sc.close();
        
        






        

    }
}
