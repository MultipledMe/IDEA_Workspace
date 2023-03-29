package week10;

public class Space_in_JVM {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("[JVM] Total Memo:"+r.totalMemory());
        r.gc();//Recycle the memory.
        System.out.println("[JVM] Free Memo1:" + r.freeMemory());
        String[]ss = new String[10000];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = new String("Java Programme Design");
        }
        System.out.println("[JVM] Free Memo2:" + r.freeMemory());
        for (int i = 0; i < ss.length; i++) {
            ss[i]=null;
        }
        r.gc();
        System.out.println("[JVM] Free Memo3:" + r.freeMemory());
    }

}
