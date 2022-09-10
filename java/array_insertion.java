import java.util.Scanner;
class insertion{
    void insert(int []arr,int size,int index,int element){
        for(int i=size-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=element;

    }
}


public class array_insertion {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        insertion var=new insertion();
        int[]arr=new int[10];
        
        System.out.println("enter size of array");
        int size=sc.nextInt();
        System.out.println("enter index u want to insert");
        int index=sc.nextInt();
        System.out.println("enter elemrnt u want to insert");
        int element=sc.nextInt();
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("first array is");
        for(int j=0;j<size;j++){
            System.out.printf("%d\t",arr[j]);
        }
        var.insert(arr,size,index,element);
        size++;
        System.out.println(" array after insertion is");
        for(int k=0;k<size;k++){
            System.out.printf("%d\t",arr[k]);
        }
        sc.close();

    }
    
}
