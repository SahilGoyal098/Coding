class Animal{
    private String color;
    private int weight;
   
   
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
        
    }
    

    

}

class dog extends Animal{
    int height;

   public void type(){
    if(height>60){
        System.out.println("dog is dangerous");
    }

    else if(height>30){
        System.out.println("dog is mature");
    }
    else{
        System.out.println("dog is cute");
    }


    }

    public int sumofseries(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    
}




public class inheritance {
    public static void main(String[]args){
        Animal pet=new Animal();
        dog var=new dog();
        pet.setColor("red");
        System.out.println(pet.getColor());
        var.height=45;
        var.type();
        var.setColor("white");
        System.out.println(var.sumofseries(5));
        
        System.out.println(var.getColor());

    }
    
}
