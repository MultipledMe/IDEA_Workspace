package week11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_demo {
    public static void main(String[] args) {
        ArrayList<CollegeStudent> s = new ArrayList<CollegeStudent>();//Dynamic Array
        //CollegeStudent[] s1 = new CollegeStudent[5];
        s.add(new CollegeStudent("ZhangSan","2000","ComputerScience"));
        s.add(new CollegeStudent("LiSi","2001","FlatDesign"));
        s.add(new CollegeStudent("WangWu","2002","String"));
        //Traversal(For loop)
        System.out.println("Common For Loop[name]:");
        for (int i = 0; i < s.size(); i++) {
            CollegeStudent cs = s.get(i);
            System.out.print(cs.name+" ");
        }
        System.out.println();
        System.out.println("Reinforced For Loop[id]:");
        for (CollegeStudent v : s) {
            System.out.print(v.id+" ");
        }
        //Iterator
        System.out.println();
        System.out.println("Iterator in generics[major]:");
        Iterator <CollegeStudent> itr = s.iterator(); //Iterator belongs to [interface]
        while (itr.hasNext()){
            CollegeStudent k = itr.next();//Unpack
            System.out.print(k.major+" ");
        }
    }
}
