import java.util.Scanner;

class matrix{
    void add(int[][]arr,int[][]arr1,int [][]add,int row ,int column){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                add[i][j]=arr[i][j]+arr1[i][j];
            }
        }

    }
}

public class matrix_add {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        matrix var=new matrix();
        System.out.println("enter rows for matix");
        int row=sc.nextInt();
        System.out.println("enter columns for matix");
        int column=sc.nextInt();
        int[][]arr=new int[row][column];
        int[][]arr1=new int[row][column];
        int[][]add=new int[row][column];

        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        
        for(int k=0;k<row;k++){
            for(int m=0;m<column;m++){
                arr1[k][m]=sc.nextInt();
            }
        }

        System.out.println("the first matrix is");
        for(int a=0;a<row;a++){
            for(int b=0;b<column;b++){
                System.out.printf("%d\t",arr[a][b]);

            }
            System.out.println();
        }

        System.out.println("the second matrix is");
        for(int c=0;c<row;c++){
            for(int d=0;d<column;d++){
                System.out.printf("%d\t",arr1[c][d]);

            }
            System.out.println();
        }
        
        var.add(arr,arr1,add,row,column);
        System.out.println("the addition matrix is");

        for(int e=0;e<row;e++){
            for(int f=0;f<column;f++){
                System.out.printf("%d\t",add[e][f]);
            }
            System.out.println();

        }
    
    }
    
}
