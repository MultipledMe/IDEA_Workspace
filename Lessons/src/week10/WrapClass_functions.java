package week10;

public class WrapClass_functions {
    public static void main(String[] args) {
        String a = "0.0";
        Double para0 = new Double (a);
        Integer para1 = new Integer("1");
        Long para2 = new Long("2");
        Float para3 = new Float("3f");

        System.out.println(para0.doubleValue());
        System.out.println(para1.intValue());
        System.out.println(para2.longValue());
        System.out.println(para3.floatValue());
    }
}
