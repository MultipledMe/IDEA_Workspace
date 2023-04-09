package Week0101.Algorithm_analyse;

public class Bubble_sort {
    public static void bubbleSort(int [] a,int n) {
            int temp, flag = 1;
        for (int i=1; i < n&&flag; i++) {//O(n)
            flag = 0;
            for(int j=0;j<n-1;j++){//O(n^2)
                if (a[j] > a[j+1]){
                    flag = 1;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
