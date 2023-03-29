package week11;

import java.util.Arrays;

public class Color_demo {
    public static void main(String[] args) {
        Color c1 = Color.GREEN;
        Color c2 = Color.BLUE;
        Color c3 = Color.RED;
        Color[] cs = {c1,c2,c3};
        Arrays.sort(cs);
        for (Color i : cs) {
            System.out.println(i.name() + ","+i.ordinal());
        }
    }
}
