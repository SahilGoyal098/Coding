import java.util.Random;
import java.util.Scanner;

public class ques {
    public static void main(String[]args){
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        String[]word=new String[5];
        String[]list=new String[5];
        String[]pet=new String[5];
        for (int i=0;i<5;i++){
            System.out.printf("word[%d]\n",i);
            word[i]=sc.nextLine();


        }
        for (int i=0;i<5;i++){
            System.out.printf("list[%d]\n",i);
            list[i]=sc.nextLine();


        }
        for (int i=0;i<5;i++){
            System.out.printf("pet[%d]\n",i);
            pet[i]=sc.nextLine();


        }
        int onelength=word.length;
        int twolength=list.length;
        int threelength=pet.length;
        int rand_1=rand.nextInt(0,onelength);
        int rand_2=rand.nextInt(0,twolength);
        int rand_3=rand.nextInt(0,threelength);
        System.out.println(word[rand_1] +list[rand_2] +pet[rand_3]);
        sc.close();






    }
}
