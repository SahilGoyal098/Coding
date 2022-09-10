import java.util.Scanner;

class trans{
    void transp(int [][]arr,int [][]arr1,int row,int column){
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                arr1[i][j]=arr[j][i];
            }
        }
    }
}

public class transpose {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        trans var=new trans();
        System.out.println("enter rows for matrix");
        int row=sc.nextInt();
        System.out.println("enter column for matrix");
        int column=sc.nextInt();
        int[][]arr=new int[row][column];
        int[][]arr1=new int[column][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();

            }
        }

        System.out.println("first matrix is");
        for(int k=0;k<row;k++){
            for(int m=0;m<column;m++){
                System.out.printf("%d\t",arr[k][m]);
            }
            System.out.println();
        }

        var.transp(arr, arr1, row, column);
        System.out.println("transpose matrix is");
        for(int a=0;a<column;a++){
            for(int b=0;b<row;b++){
                System.out.printf("%d\t",arr1[a][b]);
            }
            System.out.println();
        }
        


        




        sc.close();





    
    }  
    
}
