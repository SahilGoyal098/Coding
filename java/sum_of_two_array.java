import java.util.Scanner;

class sumofarray{
    void array(int[]arr,int[]arr1,int[]sum,int n){
        for(int i=0;i<n;i++){
            sum[i]=arr[i]+arr1[i];
        }
    
}
}

public class sum_of_two_array {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        sumofarray var=new sumofarray();
        int []arr=new int[5];
        int []arr1=new int[5];
        int []sum=new int[5] ;
        for(int i=0;i<arr.length;i++){
            System.out.printf("enter value of arr[%d]\n",i);
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<arr1.length;j++){
            System.out.printf("enter value of arr1[%d]\n",j);
            arr1[j]=sc.nextInt();
        }

        System.out.println(" the value of first array is");
        for(int m=0;m<arr.length;m++){
            System.out.printf("%d\t",arr[m]);
            
        }
        System.out.println();
        System.out.println(" the value of second array is");
        for(int l=0;l<arr1.length;l++){
            System.out.printf("%d\t",arr1[l]);
            
        }
        System.out.println();
        var.array(arr,arr1,sum,arr.length);

        System.out.println(" the value of array after addition is");
        for(int a=0;a<sum.length;a++){
            System.out.printf("%d\t",sum[a]);
            
        }

            
        
    sc.close();

        
    }
    

}
