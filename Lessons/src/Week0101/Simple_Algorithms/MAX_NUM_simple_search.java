package Week0101.Simple_Algorithms;

public class MAX_NUM_simple_search {
    public static int elements(int []a){
    int len = a.length;
    int max_num = a[0];
    for (int i=1;i<len;i++)
        if (a[i]>max_num)
            max_num = a[i];
        return max_num;
    }
}
