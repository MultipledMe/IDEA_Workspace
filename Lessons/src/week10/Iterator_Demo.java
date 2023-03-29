package week10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Iterator_Demo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Random r = new Random();
        for (int i = 0; i <10 ; i++) {
            char alp = (char)('A'+r.nextInt(25));
            al.add(alp);
        }
        System.out.println("Initial contents:" + al);
        Iterator itr = al.iterator();//Use Iterator to traverse "al"
        while (itr.hasNext()){
            Object ele = itr.next();//Initiate ele as "next"
            System.out.print(ele + " ");
        }
    }
}
