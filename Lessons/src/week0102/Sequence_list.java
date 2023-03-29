package week0102;
import java.util.Scanner;
public class Sequence_list implements Interface_for_Sequence_list {
    private Object[] listElem;
    private int curLen;

    public Sequence_list(int maxSize){
        listElem = new Object[maxSize];
        curLen = 0;//构造空顺序表
    }
    @Override
    public void clear(){
        curLen = 0;
    }

    @Override
    public boolean isEmpty() {
        return curLen == 0;
    }

    @Override
    public int length() {
        return curLen;
    }

    @Override
    public Object get(int i) throws Exception{
        if(i<0||i>curLen - 1)
            throw new Exception("第"+i+"个元素不存在");
        return listElem[i];
    }

    @Override
    public void insert(int i, Object x) throws Exception{
        if(curLen == listElem.length )
            throw new Exception("No extra space to hurdle");
        if(i<0 ||i >curLen)
            throw new Exception("插入位置错误");
        for (int j = curLen; j > i; j--)
            listElem[j] = listElem[j-1];
        listElem[i] = x;//插入元素
        curLen ++;//表长加1
        //O(n)
    }

    @Override
    public void remove(int i) throws Exception{
        if(i < curLen ||i > curLen - 1)
            throw new Exception("List length error");
        for (int j = 0; j < i; j++)
            listElem[j] = listElem[j+1];//元素前移

        curLen--;
    }

    @Override
    public int indexOf(Object x)
    {
        int j = 0;
        while (j<curLen && !listElem[j].equals(x))//j号元素与之相等，则返回j，不相等返回-1
            j++;
        if (j<curLen)
            return j;
        else
            return -1;
    }

    @Override
    public void display() {

    }

    public static void main(String[] args) throws Exception{
        int curLen = 10;
        Sequence_list L = new Sequence_list(80);//maxSize = 80;curLen = 10
        for (int i = 0; i < curLen; i++)
            L.insert(i,i);

        System.out.println("请输入i的值：");
        int i = new Scanner(System.in).nextInt();
        if (0 <i && i<=curLen){
            System.out.println("直接前驱是"+L.get(i-1));
        }
        else
            System.out.println(i+"直接前驱不存在");
    }
}
