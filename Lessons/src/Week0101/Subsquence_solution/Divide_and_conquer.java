package Week0101.Subsquence_solution;
//Time Complexity: O(n*log n)
public class Divide_and_conquer {
    public static int max_num(int[]sequence,int left,int right) {
        if (left == right)
            if (sequence[left] > 0)
                return sequence[left];
            else
                return 0;
        int mid = (right + left) / 2;
        int maxLeftSum = max_num(sequence, left, mid);//divide origin sequence into two parts
        int maxRightSum = max_num(sequence, mid + 1, right);
        int maxLeftBorderSum = 0, leftBorderSum = 0;
        for (int i = mid; i >= left; i--) {
            leftBorderSum += sequence[i];
            if (leftBorderSum > maxLeftBorderSum)
                maxLeftBorderSum = leftBorderSum;//make subsequence maximum sum
        }
        int maxRightBorderSum = 0, rightBorderSum = 0;
        for (int i = mid + 1; i <= right; i++) {
            rightBorderSum += sequence[i];
            if (rightBorderSum > maxLeftBorderSum)
                maxRightBorderSum = rightBorderSum;
        }
        return Three_intervals(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);
    }
    public static int Three_intervals(int a,int b,int c){
        int max= a>b?a:b;
        max=max>c?max:c;
        return max;
    }
    public static int max_sub(int []sequence){
//        return max_num(,0,sequence.length -1);
        return 0;
    }
}