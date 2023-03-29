package week13;

import java.io.File;

public class Access_directory {
    static void Container(File f){
        if(f.isDirectory()){//Judgement
            File []result;
            result = f.listFiles();
            if (result != null){
                for (int i = 0; i < result.length; i++) {
                    Container(result[i]);//Recursion
                }
            }
        }
        else {
            System.out.println(f);
   //         System.out.println("This is not a folder");
        }
    }
    public static void main(String[] args) {
        Access_directory.Container(new File("E://Java_io//week13"));
        Access_directory.Container(new File("E://IDEA workspace//Java//Lessons"));
    }
}
