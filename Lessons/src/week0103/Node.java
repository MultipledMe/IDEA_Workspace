package week0103;

public class Node {
    public Object data;//存放节点值
    public Node next;//后继节点的引用
    public Node(){
        this(null,null);
    }
    public Node(Object data){
        this(data,null);
    }
    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }
}
