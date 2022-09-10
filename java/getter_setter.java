class Cylinder{
   private int radius;
   private int height;



public int getRadius() {
    return radius;
}

public void setRadius(int a) {
    radius = a;
}

public int getHeight() {
    return height;
}

public void setHeight(int b) {
    height = b;
}

public float volume(){
    return(3.14f*radius*radius*height);
}
public String toString(){
    return(radius+""+height);
}


}








public class getter_setter {
    
    public static void main(String[]args){
        Cylinder var=new Cylinder();
        // var.setHeight(12);
        var.setRadius(3);
        System.out.println(var.getRadius());
        System.out.println(var.getHeight());
        System.out.println(var.volume());
        System.out.println(var);
        



    }
    
}
