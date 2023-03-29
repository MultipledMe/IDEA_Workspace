package week0103;

import java.util.Scanner;

/*
* 创建一个单链表删除单链表中多余的结点，即使操作之后的单链表只留下不相同的结点，最后输出删除后的单链表的所有结点
* */
public class RemoveRepeatElem {
    private static void removeRepeatElem(LinkList L)  throws Exception{
        Node p =L.head.next,q;//初始化，p指向首结点
        while ( p != null){
            int order = L.indexOf(p.data);
            q = p.next;//mark next node
            while (q != null){
                if(p.data.equals(q.data))//结点类的equals方法
                    L.remove(order +1);
                else
                    ++order;
                q = q.next;
        }
            p = p.next;
        }
    }

    public static void main(String[] args) throws Exception {
        //System.out.println("随机生成的单链表为：");
        //LinkList L = new LinkList(5,3);//3表示随机生成单链表,5表示单链表长度
        System.out.println("请输入单链表长度:");
        int n = new Scanner(System.in).nextInt();
        System.out.println("请选择你的插入方式{1,2,3}:");
        int way = new Scanner(System.in).nextInt();
        switch (way) {
            case 1:
            case 2:
            System.out.println("请输入单链表的的元素[-2^32,2^32]：");
            LinkList L = new LinkList(n, 1);//1表示使用尾插法
            System.out.println("删除重复结点前单链表的各个结点值为:");
            L.display();
            removeRepeatElem(L);//execute
            System.out.println("删除后为：");
//        L.display();
            L.show();
            case 3:
                System.out.println("等会儿，没写好！");
            default:
                System.out.println("没有这种方式。");
        }
    }
}


