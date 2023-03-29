package week0104.DulLinkList;

import java.util.Scanner;

public class DulLinkList implements Interface_for_DulLinkList {
    public DuLNode head;
    public DulLinkList(){
        head = new DuLNode();
        head.prior = head;//前驱
        head.next = head;//后继
        }
    public DulLinkList(int n) throws Exception{
        this();
        //int x1 = Integer.parseInt(new Scanner(System.in).next());//包装类的转换
        //int x2 = Integer.valueOf(new Scanner(System.in).next());
        System.out.println("请输入各结点数据域：");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
                insert(length(), sc.next());//使用头插法传入数据
        }
    }

    @Override
    public Object get(int i) throws Exception {
        if ( i < 0 || i > length())
            throw new Exception("下标输入不合法");

        DuLNode p = head.next;
        int j = 0;
        if(j > i || p == null)
            throw new Exception("第" + i + "个元素不存在");
        while (p != null && j<i){
            p = p.next; //指针后移
            ++j;//计数器加1
        }
        return p.data;
    }
    @Override
    public int length() {
        DuLNode p = head.next;
        int length = 0;

        while (p != null && p != head) {
            ++length;
            p = p.next;
        }

        return length;
    }
    @Override
    public void insert(int i, Object x) throws Exception {
        DuLNode p = head.next;
        int j = 0;
        while (!p.equals(head) && j < i){
            p = p.next;
            ++j;
        }
        if (j != i && !p.equals(head))
            throw new Exception("插入位置不合法");
        DuLNode s = new DuLNode(x);
        p.prior.next = s;
        s.prior = p.prior;
        s.next = p;
        p.prior = s;
    }

    @Override
    public void remove(int i) throws Exception {
        DuLNode p = head.next;
        int j = 0;
        while (!p.equals(head) && j < i){
            p = p.next;
            ++j;
        }
        if( j != i)
            throw new Exception("删除位置不合理");
        p.prior.next = p.next;
        p.next.prior = p.prior;
    }

    @Override
    public void display() {
        DuLNode node = head.next;
        while ( !node.equals(head)){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();//换行
    }





}
