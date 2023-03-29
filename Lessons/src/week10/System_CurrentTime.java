package week10;

public class System_CurrentTime {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();//Return present time
//        System.out.println(s);
        for (long i = 1; i <1000000 ; i++) {
   //         System.out.println();
        }
        long s1 = System.currentTimeMillis();
        System.out.println("[long] difference:"+(s1 - s));
//        int apxm = (int)(s1-s);//Simplification of "approximate".
//        System.out.println("[int]"+apxm);
    }
}
