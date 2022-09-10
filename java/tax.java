import java.util.Scanner;
public class tax {
    public static void main(String[]args){

        Scanner obj=new Scanner(System.in);
        System.out.println("enter tour income:");
        float extra=0;
        float income=obj.nextFloat();
        if(income<=200000){
            System.out.println("no tax to give");
        }
        else if(income>200000 && income <500000){
            extra=extra+(5*income)/100.0f;

        }
        else if(income>=500000 && income<1000000){
            extra=extra+(10*income)/100.0f;
        }
        else{
            extra=extra+(15*income)/100.0f;
        }
        System.out.println("u have to give tax on income is"+extra);

        obj.close();




    }
    
}
