package week0103;

import java.util.Scanner;

public class MergeLkst {
    public static LinkList mergeLkst_L(LinkList LA, LinkList LB){
        Node pa = LA.head.next;
        Node pb = LB.head.next;
        Node pc = LA.head;

        int da,db;
        while ( pa != null && pb != null){
            da = Integer.valueOf(pa.data.toString());
            db = Integer.valueOf(pb.data.toString());//将字符型转为整型

            if (da <= db ){
                pc.next = pa;
                pc = pa;
                pa = pa.next;
            }
            else{
                pc.next = pb;
                pc = pb;
                pb = pb.next;

            }
        }
        pc.next = (pa != null ? pa : pb);
        return LA;
    }

    public static void main(String[] args) throws Exception{
        System.out.println("请输入LA的结点数:");
        int len_LA = new Scanner(System.in).nextInt();
        System.out.println("请以非递减的方式来,输入包含"+len_LA+"个数字");
        LinkList LA = new LinkList(len_LA,2);
//        LA.show();

        System.out.println("请输入LB的结点数:");
        int len_LB = new Scanner(System.in).nextInt();
        System.out.println("请以非递减的方式来输入,包含"+len_LB+"个数字");
        LinkList LB = new LinkList(len_LB,2);//头插法

        System.out.println("将LA和LB归并后得到的新单链表为:");
        mergeLkst_L(LA,LB).display();
    }
}
