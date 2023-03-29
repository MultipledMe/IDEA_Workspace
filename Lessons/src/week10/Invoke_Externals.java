package week10;

public class Invoke_Externals {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();//instantiate
        Process p =null;
        try {
            p = r.exec("notepad");//open "notepad" of Present OS
            Thread.sleep(1000);//Program pauses for 1000 milliseconds
            p.destroy();//close
        }catch(Exception e){
            e.printStackTrace();//Return error stack.
        }
    }
}
