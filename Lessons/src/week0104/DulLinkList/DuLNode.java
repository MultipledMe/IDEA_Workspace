package week0104.DulLinkList;
public class DuLNode {
    public Object data;
    public DuLNode prior;//前驱
    public DuLNode next;
    public DuLNode(){
        this(null);
    }
    public DuLNode(Object data){
        this.data = data;
        this.next = null;
        this.prior = null;
    }
}
