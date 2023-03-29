package week13;
import java.io.*;
import static week13.ByteStream.Streamed;
/**
 * @author 王加强
 * @id 2021222784
 */
public class Test2 {
    static void BufferStreamed(File f1, File f2) throws IOException {
        InputStream fin = new BufferedInputStream(new FileInputStream(f1));
        OutputStream fou = new BufferedOutputStream(new FileOutputStream(f2));
        int count=0;
        while ((count=fin.read()) != -1){
            fou.write(count);
            char c = (char) count;
            System.out.println("ASCII:"+count+"        char:"+c);
        }
        fin.close();
        fou.close();
    }
    public static void main(String[] args) throws IOException {
        File f1 = new File("E://java_io//Copy.java");
        File f2 = new File("E://java_io//Copyy.java");
        long start = System.currentTimeMillis();
        Streamed(f1,f2);
        long end = System.currentTimeMillis();
        System.out.println("Execute time:"+(end - start));
    }
}

