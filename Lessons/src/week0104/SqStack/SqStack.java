package week0104.SqStack;

import week0104.LinkStack.IStack;

//顺序栈所有时间复杂度全为O(1)
public class SqStack implements IStack {
    private Object[] stackElem;
    private int top;
    public SqStack(int maxSize){
        top = 0;
        stackElem = new Object[maxSize];
    }
    @Override
    public void clear() {
        top = 0;
    }

    @Override
    public boolean isEmpty() {//判栈空
        return top == 0;
    }

    @Override
    public int length()
    {
        int p = top;
        return top;
    }

    @Override
    public Object peek() {
        if (!isEmpty())
            return stackElem[top - 1];
        else
            return null;
    }

    @Override
    public void push(Object x) throws Exception {//入栈
        if(top == stackElem.length)
            throw new Exception("栈已满");
        else
            stackElem[top ++] = x ;//先进行入栈操作，top 值 + 1
    }

    @Override
    public Object pop() {//出栈
        if (isEmpty())
            return null;
        else
            return stackElem[--top];
    }

    public void display(){
        for (int i = top - 1;i >= 0; i--)
            System.out.println(stackElem[i].toString() + " ");
    }
}
