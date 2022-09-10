class selfcall{
    String name;
    int age;
    int yearofstudy;

    public selfcall(String n,int a,int b){
        name=n;
        age=a;
        yearofstudy=b;


    }

    public selfcall(){
        name="pranav";
        age=20;
        yearofstudy=2022;
    }
}



public class constructor {
    public static void main(String[]args){
        selfcall base=new selfcall("sahil",19,2022);// constructor overloading("make method with class name")
        selfcall a=new selfcall();
        System.out.println(base.name);
        System.out.println(base.yearofstudy);
        System.out.println(base.age);
        System.out.println(a.name);
        System.out.println(a.yearofstudy);
        System.out.println(a.age);
    }
    
    
}
