package Week0101.Subsquence_solution;
//Time complexity: O(n^2)
public class Modified_enumeration {
    public static int max_sub(int []sequence){
        int max = 0;
        int n = sequence.length;
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum = 0;
            for (int j = i;j<n;j++){
                sum += sequence[j];
                if(sum>max)
                    max = sum;
            }
        }
        return max;
    }

}
