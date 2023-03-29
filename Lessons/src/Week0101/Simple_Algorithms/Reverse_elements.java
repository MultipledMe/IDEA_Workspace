package Week0101.Simple_Algorithms;

public class Reverse_elements {
    public static void reverse(int []a){
        int n = a.length;
        int temp;
        for (int i=0,j=n-1;i<j;i++,j--){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
