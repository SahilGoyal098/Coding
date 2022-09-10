import java.util.Scanner;
public class str {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  your name:");
        String name=sc.nextLine();
        String name1="ayush";
        name=name.toUpperCase();
        System.out.println(name);
        System.out.println(name.substring(3));
        System.out.println(name.replace("Y","A"));
        System.out.println(name.startsWith("sa"));
        System.out.println(name.charAt(6));
        System.out.println(name.length());
        System.out.println(name.substring(4,8));
        System.out.println(name.endsWith("GOYAL"));
        System.out.println(name.equals(name1));


        sc.close();


        

    }
}
