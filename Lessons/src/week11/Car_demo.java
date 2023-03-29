package week11;

import java.util.Arrays;

public class Car_demo {
    public static void main(String[] args) {
        Car s1 = new Car("s1",250,Color.BLUE);
        Car s2 = new Car("s2",2100,Color.GREEN);
        Car s3 = new Car("s3",4140,Color.RED);
        Car s4 = new Car("s4",2000,Color.WHITE);
        Car[] cars = {s1,s2,s3,s4};
        Arrays.sort(cars);
        System.out.println("Price rank:");
        for (Car i:cars) {
            System.out.println(i.brand+" :"+i.weight);
        }
        for (Car j : cars) {
            System.out.println(j.color);
        }
    }
}
