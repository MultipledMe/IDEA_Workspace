package week10;

import java.util.ArrayList;

public class Arraylist_Demo {
    public static void main(String[] args) {
        ArrayList s = new ArrayList();
        System.out.println("Initial size: "+s.size());
        s.add("a");
        s.add("b");
        s.add("c");
        s.add(1,"a2");
        System.out.println("Present size: " + s.size());
        System.out.println(s);
        s.remove(3);
        s.remove("a");
        System.out.println(s);
        Object[] ss= s.toArray();//Convert to an array
        for (Object o : ss) {
            System.out.println(o);
        }

    }
}
