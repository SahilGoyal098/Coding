import java.util.Scanner;

class spiral{
    void spiral_form(int [][]arr,int row,int column){
        int l=0;
        int k=0;
        while(k<row && l<column){
            for(int i=l;i<column;i++){
                System.out.printf("%d\t",arr[k][i]);
            }
            k++;

            for(int j=k;j<row;j++){
                System.out.printf("%d\t",arr[j][column-1]);

            }
            column--;

            if(k<row){
                for(int m=column-1;m>=l;m--){
                    System.out.printf("%d\t",arr[row-1][m]);
                }
                row--;
            }

            if(l<column){
                for(int a=row-1;a>=k;a--){
                    System.out.printf("%d\t",arr[a][l]);
                }
                l++;
            }

        }


    }
}

public class spiral_matrix {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        spiral var=new spiral();
        System.out.println("enter rows for matrix");
        int row=sc.nextInt();
        System.out.println("enter column for matrix");
        int column=sc.nextInt();
        int[][]arr=new int[row][column];

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

        var.spiral_form(arr, row, column);
    
    }

}    
