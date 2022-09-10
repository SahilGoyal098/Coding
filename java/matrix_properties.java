import java.util.Scanner;

class properties{

    void multiplication(int [][]arr,int[][]arr1,int [][]multi,int row,int column){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                int sum=0;
                for(int k=0;k<row;k++){
                    sum=sum+arr[i][k]*arr1[k][j];
                    multi[i][j]=sum;
                }
            }
        }

    }

    


}

public class matrix_properties {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        properties var=new properties();
        System.out.println("enter rows for 1st marix");
        int row=sc.nextInt();
        System.out.println("enter columns for 1st marix");
        int columns=sc.nextInt();
        System.out.println("enter columns for 2st marix");
        int column1=sc.nextInt();
        int[][]arr=new int[row][columns];
        int[][]arr1=new int[columns][column1];
        int[][]multi=new int[row][column1];

        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int k=0;k<columns;k++){
            for(int m=0;m<column1;m++){
                arr1[k][m]=sc.nextInt();
            }
        }

        System.out.println("the first matrix is");
        for(int a=0;a<row;a++){
            for(int b=0;b<columns;b++){
                System.out.printf("%d\t",arr[a][b]);

            }
            System.out.println();
        }

        System.out.println("the second matrix is");
        for(int c=0;c<columns;c++){
            for(int d=0;d<column1;d++){
                System.out.printf("%d\t",arr1[c][d]);

            }
            System.out.println();
        }

        var.multiplication(arr, arr1, multi, row, column1);
        System.out.println("the multiplication matrix is");

        for(int e=0;e<row;e++){
            for(int f=0;f<column1;f++){

                System.out.printf("%d\t",multi[e][f]);
            }
            System.out.println();
        }
        sc.close();

        




        




    }
    
}
