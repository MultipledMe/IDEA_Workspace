package week01;
import java.util.Scanner;
public class Demo {
     public static void main(String args[]){
         int nums;
         Scanner KI = new Scanner(System.in);
         System.out.println("Plz input an integer:");
         nums = KI.nextInt();
         for(int i=1;i<=nums;i++)
             System.out.println("This is the " + i + " line");
     }
}
