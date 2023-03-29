package week10;

import java.util.Random;
import java.util.TreeSet;
import  java.util.HashSet;

public class Set_Demo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        HashSet hs = new HashSet();
        Random r = new Random();
        for (int i = 0; i <10 ; i++) {
            char c = (char)('A'+r.nextInt(25));
            ts.add(c);
            hs.add(c);
        }
        System.out.println("HashSet:" + hs);
        System.out.println("TreeSet:" + ts);

        System.out.println(ts.lower("T"));//"T"lowers to "t"
        System.out.println(ts.pollFirst());//"First char"
        System.out.println(ts.pollLast());//"Last char"
        System.out.println("TreeSet:" + ts);
        hs.retainAll(ts);//Synchronize
        System.out.println("HashSet:" + hs);
    }
}
