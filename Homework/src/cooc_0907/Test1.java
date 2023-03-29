package cooc_0907;
/**
 *
 * @param
 */

import java.util.Scanner;
//note 当传参时，数据类型为基本数据类型，进行的是值传递，而不是地址或者引用传递
public class Test1 {
    public static void main(String[] args) throws Exception {
        int num1, num2;
        Scanner rd = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        num1 = rd.nextInt();
        System.out.println("请输入第二个数：");
        num2 = rd.nextInt();
        int[] nums = {num1, num2};//使用数组加临时变量交换两数位置            //保证num1始终大于num2
        //更相减损术

    }
}

