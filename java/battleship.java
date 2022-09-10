import java.util.Scanner;
class Game{
    int count=0;
    int value=0;
    int number=0;
    int number_of_kill=0;

    
    int check_guess(char [][]arr,int row,int column){
        
        if(arr[row][column]=='s'){
            System.out.println("hit");
            count++;
            arr[row][column]='0';

        }
        else if(arr[row][column]=='a'){

            System.out.println("hit");
            value++;
            arr[row][column]='0';

        }
        else if(arr[row][column]=='h'){
            System.out.println("hit");
            number++;
            arr[row][column]='0';

        }
        else{
            System.out.println("miss");
        }

        if(count==3 ){
            System.out.println("kill");
            number_of_kill++;
            count=0;
        }        
        
        else if(value==3){
            System.out.println("kill");
            number_of_kill++;
            value=0;
        }
        
        else if(number==3 ){
            System.out.println("kill");
            number_of_kill++;
            number=0;
        } 
           

        
        if(number_of_kill<3){
            System.out.println("you have killed "+ number_of_kill+"kills");
        }
        else{
            System.out.println(" good job u killed all in given turns");
        }

        return(number_of_kill);
        
    
    

    }

}


public class battleship {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Game var=new Game();
        char[][]arr=new char[7][7];
       
        for(int i=2;i<5;i++){
            arr[i][0]='s';
        }

        for(int j=3;j<6;j++){
            arr[4][j]='h';
        }

        for(int k=2;k<5;k++){
            arr[k][6]='a';
        }
        System.out.println("now start the game");
        System.out.println("best of luck");
        System.out.println("you have 7*7 grid so guess acc to it");
        int row;
        int columns;
        for(int m=0;m<(arr.length *arr.length);m++){
            System.out.println("enter your row no");
            row=sc.nextInt();
            System.out.println("enter your column no");
            columns=sc.nextInt();
            if(row>6 || columns>6 || row<0 || columns<0){
                System.out.println("check aagain ur rows and columns no. acc to grid");
                continue;
            }
            int guess=var.check_guess(arr,row,columns);
            if(guess==3){
                break;
            }



        }
        System.out.println("Game Over");
        sc.close();
    }
       
    

}



