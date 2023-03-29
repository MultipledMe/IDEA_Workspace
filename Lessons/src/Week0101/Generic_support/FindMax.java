package Week0101.Generic_support;

public class FindMax {
    public static Comparable findMax(Comparable []a){
        int k = 0;
        for (int i=1;i<a.length;i++)
            if(a[i].compareTo(a[k])>0)
                k=i;
        return a[k];
    }

    public static void main(String[] args) {
        Integer[] sh1 = {2,3,4};//基本数据类型无法使用泛型，必须使用包装类
        String[] st1 = {"Joe","Bob","Bill"};
        System.out.println(findMax(sh1));
        System.out.println(findMax(st1));

    }
}
