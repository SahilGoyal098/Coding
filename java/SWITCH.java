import java.util.Scanner;

public class SWITCH {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your choice to know about day in week");
        int choice=input.nextInt();
        switch(choice){
            case 1:
            System.out.println("sunday");
            break;

            case 2:
            System.out.println("monday");
            break;

            case 3:
            System.out.println("tuesday");
            break;

            case 4:
            System.out.println("wednesday");
            break;

            case 5:
            System.out.println("thrusday");
            break;

            case 6:
            System.out.println("friday");
            break;

            case 7:
            System.out.println("sat");
            break;

            default:
            System.out.println("u are out of mind");





        }


        input.close();
    }
    
}
