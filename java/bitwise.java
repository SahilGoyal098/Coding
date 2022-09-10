public class bitwise {
    public static void main(String[]args){
        int a=75;//1001011
        int b=8;//0001000
        int c=4;
        System.out.println(a&b);//output-0001000 which is binary no.of 8
        System.out.println(a|b);//out put-1001011
        System.out.println(a<<c);//here binary no.of a shifts by 2 bits in left side and in front filled by zero
        System.out.println(a>>2);// here binary no.shift by 2 bits in right side like 75=1001011 now after shift by 2 in right the  binary no. become10010
        System.out.println(14<<1);



    }
    
}
