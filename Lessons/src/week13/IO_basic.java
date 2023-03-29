package week13;

import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;

public class IO_basic {
    public static void main(String[] args) throws IOException {
        File file = new File("E://Java_io//week13");//File is an object
        file.mkdir();
//        File file1 = new File("E://Javas//javas");
//        file1.mkdirs(); //Batch creation
        boolean a = file.mkdir();//False for [created] things.
        if(a==true){
            System.out.println("Successfully created.");
            File file1 = new File(file,"a.txt");
            File file2 = new File("E://Java_io//week13//b.txt");
            if(!file1.exists()){
                file1.createNewFile();
            }
            else {
                System.out.println("It  already exists.");
            }
            try {
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
            }
            catch (SocketTimeoutException e){
                e.printStackTrace();
            }
            finally {
                System.out.println("Program ends.");
            }
        }
    }
}
