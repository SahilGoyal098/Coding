// import java.util.Scanner;

public class vararguments {

    int addition(int...arr){    // ...arr act as []arr or we can say like array
        int sum=0;
        for(int element:arr){
            sum=sum+element;
        }
        return(sum);

    }

    public static void main(String[]args){
        vararguments var=new vararguments();
        System.out.println("the sum of two element is "+var.addition(4,5));
        System.out.println("the sum of threee element is "+var.addition(4,5,6));
        System.out.println("the sum of four element is "+var.addition(4,5,6,7));
        System.out.println("the sum of five element is "+var.addition(4,5,6,7,8));

    }
    
}
