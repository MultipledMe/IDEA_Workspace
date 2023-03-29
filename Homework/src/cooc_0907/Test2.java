package cooc_0907;
import java.time.LocalDate;
import java.util.Scanner;

public class Test2 {
    public static void main(String []args) {
        Scanner rd = new Scanner(System.in);
        int month = rd.nextInt();
        int year = rd.nextInt();
        //if(month==1)
//        switch (month){
//            case 2:System.out.println("w");
//        }
        System.out.println("This month has " + LocalDate.of(year, month, 1).lengthOfMonth() + " days");
    }
}
