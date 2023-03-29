import java.util.Arrays;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        int [] array_int = new int[10];
        int max,index=0,sum = 0;
        Random r = new Random();
        System.out.println("The randomly generated array is: ");
        for (int i = 0; i < array_int.length ; i++) {
            //array_int[i] = (int)(20+Math.random()*(80-20+1));
            array_int[i] = (int)(20+r.nextInt(80-20+1));//(int)([min]+Math.random()*(max-min+1))
            System.out.print(array_int[i]+" ");

            if(i%2 ==0&&(i+1)%2==0&&(i+2)%2==0){
                System.exit(0);//Only recommend for single thread,terminate JVM.
            }
        }

        for (int i : array_int) {
            if(i%3==0) sum +=i;}
        System.out.println();
        System.out.println("Numbers [multiple of 3] sum equals:"+sum);
        max = array_int[0];
        for (int j = 1; j < array_int.length; j++) {
            if (array_int[j]<max) {
                max = array_int[j];
                index = j;
            }
        }
        System.out.println("Maximum number of 'array_int' is "+max+" Locates at "+ index+" [index].");
        for (int i = 0; i < array_int.length; i++) {
            for (int j = 0; j < array_int.length-i-1; j++) {
                if(array_int[j]>array_int[j+1]){
                    int temp = array_int[j];
                    array_int[j] = array_int[j+1];
                    array_int[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int num : array_int) {
            System.out.print(num+" ");
        }
        Arrays.sort(array_int,1,array_int.length);//Arrays.sort([para],fromIndex,toIndex)
        Arrays.binarySearch(array_int,4);//Arrays.binarySearch([para],[num])
        Arrays.parallelSort(array_int);//[para]
        //ParallelSort:The sorting algorithm is a parallel sort-merge that breaks the array into sub-arrays that are themselves sorted and then merged.


    }
}
