// import java.util.Scanner;

public class overloading {
    static float avg(float...arr){
        float sum=0.0f;
        for(float element:arr){
            sum=sum+element;
        }
        float average=sum/(float)arr.length;
        return(average);

    }

    static void greet(){
        System.out.println("good morning");
    }
    static void greet(String name){
        System.out.println("good morning"  +name);
    }

    static void greet(String name1,String name2){
        System.out.println("good morning"  +name1 +"and"  +name2);
    }

    public static void main(String[]args){
        System.out.println("the average is "+avg(5.4f,6.7f,7.8f,8.2f));
        greet();
        greet("sahil","ayush");
        greet("sahil");

    }

    
}
