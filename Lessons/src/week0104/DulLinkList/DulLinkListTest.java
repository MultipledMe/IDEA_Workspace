package week0104.DulLinkList;

import week0104.DulLinkList.DulLinkList;

import java.util.Scanner;

public class DulLinkListTest {
    public static void main(String[] args) throws Exception{
        System.out.println("请输入双向链表DLL的结点个数：");
        int n = new Scanner(System.in).nextInt();
        DulLinkList DLL = new DulLinkList(n);
//        for (int i = 0; i < n; i++) {
//            DLL.insert(0,n);
//        }
        System.out.println("由尾插法生成的双向循环链表为");
        DLL.display();

        System.out.println("现在进行求线性表长度操作，结果为：");
        System.out.println(DLL.length());

        System.out.println("现在进行插入操作，请输入插入位置索引insert_loc:");
        int insert_loc = new Scanner(System.in).nextInt();
        System.out.println("请输入插入的内容[Object]:");
        Object insert_item = new Scanner(System.in).next();
        DLL.insert(insert_loc,insert_item);
        System.out.println("现在的链表为：");
        DLL.display();

        System.out.println("现在进行删除操作，请输入删除位置remove_loc");
        int remove_loc = new Scanner(System.in).nextInt();
        DLL.remove(remove_loc);
        System.out.println("现在的链表为：");
        DLL.display();

        System.out.println("现在进行取结点值操作，请输入结点位置node_loc");
        int node_loc = new Scanner(System.in).nextInt();
        System.out.println("取出的结点值为：");
        System.out.println(DLL.get(node_loc));

        System.out.println("现在的链表为：");
        DLL.display();
    }
}
