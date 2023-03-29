package week0103;
import week0102.Interface_for_Sequence_list;

import java.util.Random;
import java.util.Scanner;

public class LinkList<n> implements Interface_for_Sequence_list{

    public Node head;//单链表的头指针
    public LinkList(){
        head = new Node();
    }//创建空结点

    public LinkList(int n, int way) throws Exception{

        this();//初始化头结点 Line 9
        if(way == 1)//头插法
            create1(n);
        else if (way == 2)
            create2(n);//尾插法
        else if(way == 3)
            create3(n);
    }
    //随机生成

    private void create3(int n) throws Exception{
        for (int i = 0; i < n; i++) {
            System.out.println("输入最小值:");
            int max = new Scanner(System.in).nextInt();
            System.out.println("输入最大值：");
            int min = new Scanner(System.in).nextInt();
//            System.out.println("输入链表结点个数：");
//            int count = new Scanner(System.in).nextInt();
//            int num = new Random().ints(min,(max+1)).limit(1).findFirst().getAsInt();
            int num = (int)(Math.random() * n);
            insert(i,num);
        }
    }

    private void create2(int n) throws Exception{//使用尾插法创建单链表
        Scanner sc = new Scanner(System.in);
        for(int j=0;j<n;j++){
            insert(0,sc.nextInt());//时间复杂度O(n)
        }
    }

    private void create1(int n) throws Exception{
        Scanner sc = new Scanner(System.in);
        for(int j=0;j<n;j++){
            insert(length(),sc.nextInt());//O(n)
        }
    }



    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length(){
        Node p = head.next;
        int length = 0;
        while (p != null){
            ++length;
            p = p.next;
        }
        return length;
    }

    @Override
    public Object get(int i) throws Exception {
        Node p = head.next;
        int j = 0;
        while (p != null && j<i){
            p = p.next; //指针后移
            ++j;//计数器加1
        }
        if(j>1||p == null){
            throw new Exception("第"+i+"个元素不存在");
        }
        return p.data;
    }

    @Override
    public void insert(int i, Object x) throws Exception {
        Node p =head;
        int j = -1;
        while (p != null && j<i-1){
            p = p.next;
            ++j;
        }
        if(j>i-1 || p == null)
            throw new Exception("插入位置不合法");
        Node s = new Node(x);
        s.next = p.next;
        p.next = s;
    }
    //无头结点的插入算法
    public void Non_Head_node_insert(int i, Object x) throws Exception{
        Node p = head;
        int j =0;
        while ( p!=null && j<i-1){
            p = p.next;
            ++j;
        }
        if (j>1 || p == null){
            throw new Exception("插入位置不合法");
        }

        Node s = new Node(x);//class Node in which contains one parameter is its length.
        if (i == 0){//头结点插入
            s.next = head;
            head = s;
        }
        else{//中间或尾部插入
            s.next = p.next;
            p.next = s;
        }
    }
    @Override
    public void remove(int i) throws Exception {
        Node p = head;
        int j = -1;
        while (p.next != null && j<i-1){
            p = p.next;
            ++j;
        }
        //不带头结点的单链表的删除操作
        if (j > i-1 || p.next ==null){
            throw new Exception("删除位置不合法.");
        }
        p.next = p.next.next;
    }
    public void non_forenode(int i) throws  Exception{

    }
    @Override
    public int indexOf(Object x) {
        Node p = head.next;
        int j = 0;
        while (p != null && !p.data.equals(x)){
            p = p.next;
            ++j;
        }
        if(p != null) {
            return j;}
        else
            return -1;
    }

    @Override
    public void display() {
        Node p = head.next;
        while(p != null){
            System.out.println(p.data + " ");
            p = p.next;//取下一个结点
        }
        System.out.println();//换行
    }
    public void show(){
        Node o = head.next;
        while (o != null){
            System.out.print(o.data + " ");
            o = o.next;
        }
    }
//求前驱
    public static void main(String[] args) throws Exception {
        int n = 10;
        LinkList L = new LinkList();//创建空的单链表 ->line 9
        for (int i = 0; i < n; i++)
            L.insert(i,i);
        System.out.println("请输入i的值");
        int i = new Scanner(System.in).nextInt();
        if(0<i && i <= n){
            System.out.println("第" + i + "个元素的直接前驱为：");
        }
        else
            throw new Exception("该元素无直接前驱。");
    }
}
