package cooc_0914;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String a,b,c;
        int count = 0;
        Scanner rd = new Scanner(System.in);
        try {
            System.out.println("输入第 1个字符串");
            a = rd.next();
            System.out.println("输入第 2个字符串");
            b = rd.next();
            System.out.println("输入第 3个字符串");
            c = rd.next();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        String strs[] = {a,b,c};

        for (int i = 0; i < (a+b+c).length; i++) {
            strs[i].toLowerCase();
            if((a+b+c).charAt(i)==a){

            }
        }
        System.out.println("Presence for times of A |& a"+count);
    }
}
