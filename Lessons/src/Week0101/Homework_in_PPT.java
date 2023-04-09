package Week0101;

import java.util.Arrays;

//有一个包括100个数据元素的数组，每个数据元素的值都是实数，试编写一个求最大数据元素的值及下标的算法，并分析算法的时间复杂度
public class Homework_in_PPT {
    //参考答案
    void max(double []a){
        double max = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]){
                max = a[i];
                index = i;
            }
        }
        System.out.println("最大的数为："+ a + ",其下标为："+ index);
    }

    public void Find_maxNum_and_index_in_100_num(int[] a, int n){//使用a表示包含100个元素的数组，n表示数组的下标
        //先随机生成的元素
        for (int i = 0; i < a.length; i++) {

        }
//        for (int i = 0; i < n-1; i++) {//二分查找
//            int curLen = a.length;
//            int left = 0;
//            int right = curLen;
//
//        }
    }

}
