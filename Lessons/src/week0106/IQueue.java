package week0106;

public interface IQueue {
    public void clear();
    public void isEmpty();
    public int length();

    public Object peek();
    public void offer(Object x) throws Exception;
    public Object poll();
}
