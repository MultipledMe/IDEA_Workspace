package week11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_demo {
    public static void main(String[] args) {
        HashSet<CollegeStudent> hs = new HashSet<CollegeStudent>();
        //CollegeStudent[] s1 = new CollegeStudent[5];
        hs.add(new CollegeStudent("ZhangSann","2000","ComputerScience"));
        hs.add(new CollegeStudent("LiSii","2001","FlatDesign"));
        hs.add(new CollegeStudent("WangWuu","2002","String"));

        Iterator<CollegeStudent> itr = hs.iterator();
        while (itr.hasNext()){
            CollegeStudent k = itr.next();//Transition downward
            System.out.println(k.name + " :" + k.id + " :" + k.major);

        }
    }
}
