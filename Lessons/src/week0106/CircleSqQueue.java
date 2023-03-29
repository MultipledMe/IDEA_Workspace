package week0106;

public class CircleSqQueue implements IQueue{
    private Object [] queueElem;
    private int front;
    private int rear;
//branch dev has merged
    public CircleSqQueue(int maxSize){
        front = rear = 0 ;
        queueElem = new Object[maxSize];
    }
    @Override
    public void clear() {
        front = rear = 0;

    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public int length() {
        return (rear - front + queueElem.length) % queueElem.length;
    }

    @Override
    public Object peek() {
        if (front == rear )
            return null;
        else
            return queueElem[front];
    }

    @Override
    public void offer(Object x) throws Exception {

    }

    @Override
    public Object poll() {
        return null;
    }

    public void display(){
        if (!isEmpty()){
            for (int i = front; i != rear ; i = (i + 1) % queueElem.length) {
                System.out.println(queueElem[i].toString() + " ");
            }
        }
        else {
            System.out.println("空队列");
        }
    }
}
