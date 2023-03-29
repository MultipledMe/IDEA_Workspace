package week0102;

public interface Interface_for_Sequence_list {
    public void clear();//置空方法
    public boolean isEmpty();//判空方法

    public int length();//获取线性表长度
    public Object get(int i) throws Exception;//取元素
    public void insert(int i, Object x) throws Exception;//插入元素

    public void remove(int i) throws Exception;//移除元素

    public int indexOf(Object x);//查找元素

    public void display();//输出
}
