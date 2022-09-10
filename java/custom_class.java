class Employee{
    int id;
    String company="google";
    String name;

    int sum(int a,int b){
        int c;
        c=a+b;
        return(c);
    }


}




public class custom_class {
    public static void main(String[]args){
        Employee e1=new Employee();
        e1.name="sahil";
        System.out.println(e1.company);
        System.out.println(e1.sum(7,8));
        System.out.println(e1.name);
    }
    
}
