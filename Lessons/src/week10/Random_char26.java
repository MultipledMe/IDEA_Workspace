package week10;
import java.util.Arrays;
import java.util.Random;

public class Random_char26 {
    public static void main(String[] args) {
        char [] cc = new char[26];
        Random r = new Random();//initiation
        for (int i = 0; i < cc.length; i++) {
            cc[i]  =(char)('A'+r.nextInt(26));
        }
        System.out.println("Before:"+new String(cc));
        Arrays.sort(cc);
        System.out.println("After:" + new String(cc));
    }
}
