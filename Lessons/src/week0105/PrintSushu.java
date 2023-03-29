package week0105;

public class PrintSushu {

    public static void main(String[] args) {

//方法一：根据素数的定义来遍历检查
//外层循环遍历被除数i(因为1既不是素数也不是和数，所以直接从2开始遍历)
        for (int i = 2; i <= 50; i++) {
//定义一个逻辑值，初值为true
            boolean flag = true;
//内层遍历除数j
            for (int j = 2; j < i; j++) {
//判断是否存在j能整除i，若存在，则更改flag的值并跳出循环
                    if (0 == i % j) {
                        flag = false;
                    break;
                }
            }
//根据flag的值判断是否输出i
            if (flag) {
                System.out.print(i + " ");
            }
        }
        System.out.println('\n' + "---------------------------");
    }
}

////方法二：根据判断条件2进行遍历检查，减少遍历次数
////外层循环遍历被除数i(因为1既不是素数也不是和数，所以直接从2开始遍历)
//        for (int i = 2; i <= 100; i++) {
////定义一个逻辑值flag，初始值为true
//            boolean flag = true;
////内层循环遍历除数j(注意：此处若不取边界，则当i=4时，j=2会因为小于i/2=2而直接跳出内循环)
//            for (int j = 2; j <= (i / 2); j++) {
////判断是否存在除数j能整除i，若存在，则修改flag的值并跳出循环
//                if (0 == i % j) {
//                    flag = false;
//                    break;
//                }
//            }
////根据flag的值判断是否输出i
//            if (flag) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println('\n' + "---------------------------");
//
//
////方法三：根据判断条件3进行遍历检查，减少遍历次数
////外层循环遍历被除数i(因为1既不是素数也不是和数，所以直接从2开始遍历)
//        for (int i = 2; i <= 100; i++) {
////定义一个逻辑值flag，初始值为true
//            boolean flag = true;
////内层循环遍历除数j(注意：此处若不取边界，则当i=4时，j=2会因为小于sqrt(i)=2而直接跳出内循环)
////再思考一下若i=25时呢？若不取边界还有那些不是素数的数会输出呢？
//            for (int j = 2; j <= Math.sqrt(i); j++) {
////判断是否存在除数j能整除i，若存在，则修改flag的值并跳出循环
//                if (0 == i % j) {
//                    flag = false;
//                    break;
//                }
//            }
////根据flag的值判断是否输出i
//            if (flag) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println('\n' + "---------------------------");
//
//
//        /*方法四：在方法三的前提上优化，优化基础是除2外的所有偶数均不是素数，
//         *(i+=2)只遍历奇数，减少外层遍历次数；同理，由于奇数是不能被偶数整除的，
//         *(j+=2)只遍历奇数，减少内层遍历次数
//         */
//        System.out.print("2 ");
////外层循环遍历被除数i(因为1既不是素数也不是和数，所以直接从2开始遍历)
//        for (int i = 3; i <= 100; i += 2) {
////定义一个逻辑值flag，初始值为true
//            boolean flag = true;
////内层循环遍历除数j(注意：此处若不取边界，则当i=4时，j=2会因为小于sqrt(i)=2而直接跳出内循环)
////再思考一下若i=25时呢？若不取边界还有那些不是素数的数会输出呢？
//            for (int j = 3; j <= Math.sqrt(i); j += 2) {
////判断是否存在除数j能整除i，若存在，则修改flag的值并跳出循环
//                if (0 == i % j) {
//                    flag = false;
//                    break;
//                }
//            }
////根据flag的值判断是否输出i
//            if (flag) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println('\n' + "---------------------------");
//
//
////联想一下，能被2整除（偶数）的直接剔除，同样的道理，能被3or5整除的剔除掉会不会让外层循环的次数更少呢？
////此处才到100，若是1000呢？10000呢？
////定义一个数组，由于剔除了偶数，故数组长度不会超过总个数的一半
//        int[] arr = new int[500];
//        int count = 0;
//        for (int i = 6; i <= 1000; i++) {
//            boolean flag = true;
//            if (0 == i % 2 || 0 == i % 3 || 0 == i % 5) {
//                flag = false;
//            }
//
//            if (flag) {
//                arr[count] = i;
//                count++;
//            }
//        }
//        System.out.println("6~1000中剔除能被2or3or5整除的数后还剩" + count + "个");
//        System.out.println("1~1000中所有素数为：");
//        System.out.print("2" + "\t");
//        System.out.print("3" + "\t");
//        System.out.print("5" + "\t");
//        count = 0;
//        for (int i = 0; i < 500; i++) {
//            boolean flag = true;
//            if (0 == arr[i]) {
//                break;
//            }
//
//            for (int j = 7; j <= Math.sqrt(arr[i]); j += 2) {
//                if (0 == (arr[i]) % j) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                System.out.print((arr[i]) + "\t");
//                count++;
//            }
//        }
//        System.out.println("\n" + "---------------------");
//        System.out.println("\n" + "其中6~1000中剔除能被2or3or5整除的数中还是素数的有" + count + "个");
//
//    }
//}
