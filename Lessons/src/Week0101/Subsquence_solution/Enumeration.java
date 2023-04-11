package Week0101.Subsquence_solution;
/*/
Give a sequence consisted with{A1,A2,...,An}
find one subsequence{Ai,...,Aj}
Satisfy its sum is the maximum num of this sequence.
 */
//穷举法
//Time complexity: O(n^3)
public class Enumeration {
    public static int max_sub(int []sequence){
        int max = 0;
        int n = sequence.length;
        int sum = 0;
        for (int i=1;i <= n;i++){
            for (int j=1;j<n;j++){
                sum = 0;
                for (int k = j; k<j+1 && k<n; k++)
                    sum += sequence[k];
                if (sum>max)
                    max = sum;
            }
        }
        return  max;
    }
}
