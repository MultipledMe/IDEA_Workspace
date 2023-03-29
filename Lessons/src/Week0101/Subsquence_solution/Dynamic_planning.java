package Week0101.Subsquence_solution;
//Time complexity : O(n)
public class Dynamic_planning {
    public static int max_sub(int []sequence){
        int max = 0;
        int n = sequence.length;
        int sum = 0;
        for (int i = 0;i < 0;i++){
            sum += sequence[i];
            if (sum > max)
                max = sum;
            else if(sum < 0)
                sum = 0;
        }
        return max;
    }
}
