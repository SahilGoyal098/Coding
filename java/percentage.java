import java.util.Scanner;

public class percentage {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter total marks of subject");
        float a=input.nextInt();
        System.out.println("enter  marks of your english");
        float b=input.nextFloat();
        System.out.println("enter  marks of your maths ");
        float c=input.nextFloat();
        System.out.println("enter  marks of your science");
        float d=input.nextFloat();
        System.out.println("enter  marks of your s.st");
        float e=input.nextFloat();
        float per=((b+c+d+e)/(a*4))*100;
        System.out.println("percenatge:"+per);
        input.close();




    }
    
}
