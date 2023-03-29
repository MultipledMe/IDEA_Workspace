package week13;//王加强
import java.io.*;//2021222784
public class Test4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        test1();
        test2();
    }
    //序列化
    public static void test1() throws IOException {
        Student s = new Student("王加强",19);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E://java_io//Homo.java"));
        oos.writeObject(s);
        oos.close();
    }
    //反序列化
    public static void test2() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E://java_io//Homo.java"));
        //取数据，装箱
        Object k = ois.readObject();
        //查看k的类型--反射
        System.out.println(k.getClass());
        Student ss = (Student) k;
        System.out.println(ss.name + " :" + ss.age);
        ois.close();
    }
}

