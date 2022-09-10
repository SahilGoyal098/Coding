public class alphabet {
    public static void main (String[]args){
        int count=0;
        // for(int i=65;i<91;i++){      //alphabet print lower and upper
        //      System.out.println((char)(i));
        //      System.out.println((char)(i+32));
        // }
         
        // for(int j=0;j<10;j++){

        //     for(int k=0;k<10;k++){

        //         System.out.print("0");
        //      }
        //     System.out.println();
        // }

        for(int m=100;m<=200;m++){

            int a=m;
            while(a!=0){
                int d=a%10;
                if(d==2){
                    count++;
                }
                a=a/10;
            }
        }
        System.out.println(count);


        
    }
    
}
