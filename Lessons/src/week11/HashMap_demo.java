package week11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_demo {
    public static void main(String[] args) {
        HashMap<Integer,CollegeStudent> hm =new HashMap<Integer,CollegeStudent>();  //[Integer]:BasicClass is illegal in generic.
        hm.put(1,new CollegeStudent("ZS","999","cs"));
        hm.put(2,new CollegeStudent("LS","99","cs"));
        hm.put(3,new CollegeStudent("WW","9","se"));

        //Traverse,depend on Iterator,get the [set] of [key],then the [value] owing to functions.
        Set <Integer>s = hm.keySet();//Feedback set of keys
        Iterator<Integer> itr = s.iterator();
        while (itr.hasNext()){
            Integer k = itr.next();//K refers to key
            CollegeStudent v = hm.get(k);//unpack
            System.out.println(v.major + " has " + v.name);
        }
    }
}
