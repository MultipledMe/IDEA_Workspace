package week0104.LinkStack;

public class LinkStack implements IStack {
    private Node top;
    @Override
    public void clear() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    //求链栈长度
    public int length() {
        Node p = top;
        int length = 0;
        while ( p != null){
            p = p.next;
            length++;
        }
        return length;
    }

    @Override
    public Object peek(){//取栈顶元素返回值
        if (!isEmpty())
            return top.data;
        else
            return null;
    }

    @Override
    //入栈操作
    public void push(Object x) throws Exception {
        Node p = new Node(x);
        p.next = top;
        top = p;
    }


    @Override
    public Object pop() {
        Node p = top;
        if (isEmpty()){
            return null;
        }
        else {
            p = top;
            top = top.next;
            return p.data;
        }
    }

    @Override
    public void display() {
        Node p = top;
        while (p != null){
            System.out.println(p.data.toString() + " ");
            p = p.next;
        }
    }
}
