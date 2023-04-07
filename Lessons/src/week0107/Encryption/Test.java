package week0107.Encryption;

import week0107.SeqString;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        SeqString originfilename,encryptedfilename;
        int key;
        TextFileEncryption textfile = new TextFileEncryption();
        System.out.println("文本文件加密解密演示程序");
        System.out.println("请选择?(1-加密 2-解密)：");
        int select = sc.nextInt();
        if (select == 1){
            System.out.println("请输入需要被加密的文本文件名：");
            originfilename = new SeqString(sc.next());
            System.out.println("请输入加密后的文本文件名：");
            encryptedfilename = new SeqString(sc.next());
            System.out.println("请输入加密密钥：");
            key = sc.nextInt();
            textfile.encryptFile(originfilename,encryptedfilename, key);
            System.out.println("加密成功！文件：" + originfilename + "已被加密为：" + encryptedfilename);
        }else {
            System.out.println("请输入需要解密的文本文件名：");
            encryptedfilename = new SeqString(sc.next());
            System.out.println("请输入解密后的文本文件名：");
            originfilename = new SeqString(sc.next());
            System.out.println("请输入解密密钥：");
            key = sc.nextInt();
            textfile.decryptFile(encryptedfilename, originfilename, key);
            System.out.println("解密成功！文件："+ encryptedfilename + "已被解密为：" +originfilename);
        }

    }
}
