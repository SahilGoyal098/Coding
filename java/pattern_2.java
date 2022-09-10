public class pattern_2 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        
        for(int k=0;k<n;k++){
            for(int m=0;m<k+1;m++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    
    public static void main(String[]args){
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("*");

            }
            System.out.print("\n");
        }

        pattern(5);

    }
}
