package week13;

import java.io.*;
//import java.nio.charset.StandardCharsets;

public class Encode_demo {
    public static void main(String[] args) throws IOException {
        test1();
        test2();
    }

    //method1
    public static void test1() throws IOException {
        //节点：数据的源和终点
        Reader fr = new FileReader("E://Java_io//week13//amp.txt");//源头--节点
        //传输过程中进行转码，使用字节流来处理
        OutputStream fo = new FileOutputStream("E://Java_io//week13//fo.txt");
        //创建一个转换空间
        char[] data = new char[10];
        int len;//读到数据长度
        while ((len = fr.read(data)) != -1){
            //转换为字符串
            String k = new String(data,0,len);
            //写入数据，并且转码
            fo.write(k.getBytes("gbk"));//StandardCharsets.UTF_8
        }
        //关闭流
        fr.close();
        fo.close();
    }

    //method2
    public static void test2() throws IOException {
        //节点：数据的源和终点
        Reader fr = new FileReader("E://Java_io//week13//amp.txt");//源头--节点
        //使用OutputStreamWriter进行转码，使用字节流来处理，是一种转换流,以下为快速创建
        OutputStreamWriter fow = new OutputStreamWriter(new FileOutputStream("E://Java_io//week13//fow.txt"),"gbk");
        //创建一个转换空间
        char[] data = new char[10];
        int len;//读到数据长度
        while ((len = fr.read(data)) != -1){
                fow.write(data,0,len);//后面两个是索引

        }
        //关闭流
        fr.close();
        fow.close();
    }



}
