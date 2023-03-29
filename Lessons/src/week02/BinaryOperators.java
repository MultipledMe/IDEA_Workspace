package week02;

import java.util.Scanner;

public class BinaryOperators {
    public static void main(String args[]){
        Scanner KI = new Scanner(System.in);
        System.out.println("Plz input an integer:");
        int a = KI.nextInt();
        System.out.println("The num you input is "+a);
        System.out.println("The num a++ is "+(a++)+" because a++ uses a firstly.");
        System.out.println("Now a equals " + a);
        System.out.println("The num ++a is "+(++a)+ " because ++a adds itself firstly.");
    }
}
