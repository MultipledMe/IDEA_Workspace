package week13;

import java.awt.*;
import java.io.*;

//通过文件复制，学习字节流方式读取文件
public class ByteStream {
    //不带缓冲功能的普通字节流
    static void Streamed(File f1,File f2) throws IOException {
        //创建输入流对象
        InputStream fin = new FileInputStream(f1);
        //创建输出流对象
        OutputStream fou = new FileOutputStream(f2);
        int count=0;
        //读写文件，通常是一个持续的过程，多次读写,文件读完以后，read()返回-1
        while ((count=fin.read()) != -1){
            //读到的数据，写入输出流
            fou.write(count);
            char c = (char) count;
            System.out.println("ASCII:"+count+"        char:"+c);
        }
        //循环结束时，文件读写结束，关闭输入输出流
        fin.close();
        fou.close();
    }
    //带缓冲功能
    static void BufferStreamed(File f1,File f2) throws IOException {
        //创建输入流对象
        InputStream fin = new BufferedInputStream(new FileInputStream(f1));//装饰者模式
        //创建输出流对象
        OutputStream fou = new BufferedOutputStream(new FileOutputStream(f2));
        int count=0;
        //读写文件，通常是一个持续的过程，多次读写,文件读完以后，read()返回-1
        while ((count=fin.read()) != -1){
            //读到的数据，写入输出流
            fou.write(count);
            char c = (char) count;
            System.out.println("ASCII:"+count+"        char:"+c);
        }
        //循环结束时，文件读写结束，关闭输入输出流
        fin.close();
        fou.close();
    }
    //test
    public static void main(String[] args) throws IOException {
        File f1 = new File("E://java_io//week13//ori//test1.txt");
        File f2 = new File("E://java_io//week13//copy//test2.txt");
        long start = System.currentTimeMillis();
        Streamed(f1,f2);
        long end = System.currentTimeMillis();
        System.out.println("Execute time:"+(end - start));
    }
}
