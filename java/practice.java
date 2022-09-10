class Employee{
    String name="google";
    int number_Of_Employees=1000;

}



public class practice {
    public static void main(String[]args){
        Employee e1=new Employee();
        e1.name="microsoft";
        
        System.out.println(e1.name);//print microsoft not google

    }    
}
