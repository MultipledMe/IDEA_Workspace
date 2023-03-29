package week12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws Exception{
        Scanner KI = new Scanner(System.in);
        System.out.println("请输入被除数:");
        try {
                int num1 = KI.nextInt();
                System.out.println("请输入除数:");
                int num2 = KI.nextInt();
                System.out.println();
                System.out.println(String.format("%d/%d=%d", num1, num2, num1 / num2));
        }
        catch (InputMismatchException e) {
            System.out.println("Input[int]!");
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            System.out.println("[by] num is not zero");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Other errors.");
            e.printStackTrace();
        }
        finally {
            System.out.println("Program ends");
        }
    }
}
