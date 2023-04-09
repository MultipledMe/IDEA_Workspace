package week0107;


import java.util.Random;

public class BF_KMP {
    public int indexBFCount(SeqString s, SeqString t, int begin){
        int slen,tlen,i = begin,j = 0;
        int count = 0;

        slen = s.length();
        tlen = t.length();

        while ((i < slen) && (j < tlen)){
            if (s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                i = i - j + 1;
                j = 0;
            }
            count++;
        }
        return count;
    }
    public int[] getNext(SeqString  T){
        int [] next = new int[T.length()];
        int j = 1;
        int k = 0;
        next[0] = -1;
        next[1] = 0;
        while (j < T.length() -1 ){
            if (T.charAt(j) == T.charAt(k)){
                next[j+1] = k+1;
                j++;
                k++;
            } else if (k == 0) {
                next[j+1] = 0;
                j++;
            }else {
                k = next[k];

            }
        }
        return (next);
    }
    public int indexKMPCount(SeqString s,SeqString t,int begin){
        int[] next = getNext(t);
        int i = begin;
        int j = 0;
        int count = 0;
        while (i < s.length() && j < t.length()){
            if (j == -1 || s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            } else if (j == 0) {
                i++;
            }else {
                j = next[j];
            }
            count++;
        }
        return  count;
    }
    //length用户要求产生字符串的长度
     public static String getRandomString(int length){
     String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";//这里也可以用ascii码
     Random random=new Random();
     StringBuffer sb=new StringBuffer();
     for(int i=0;i<length;i++){
       int number=random.nextInt(62);
       sb.append(str.charAt(number));
     }
     return sb.toString();
    }

    public static void main(String[] args) {
        String str_s1 = getRandomString(10);
        String str_s2 = getRandomString(10);
        String str_t1 = getRandomString(5);
        String str_t2 = getRandomString(5);

        System.out.println("随机生成的主串1为："+str_s1);
        System.out.println("随机生成的模式串1为："+str_t1);
        System.out.println("随机生成的主串2为："+str_s2);
        System.out.println("随机生成的模式串2为"+str_t2);

        SeqString s1 = new SeqString(str_s1);
        SeqString t1 = new SeqString(str_t1);
        SeqString s2 = new SeqString(str_s2);
        SeqString t2 = new SeqString(str_t2);//也可以放进数组里，按索引取；亦可以根据java的泛型方法
//实例化
        BF_KMP p = new BF_KMP();
        System.out.println("BF compare count for s1:" + p.indexBFCount(s1,t1,0));
        System.out.println("KMP compare count for s1:" + p.indexKMPCount(s1,t1,0));
        System.out.println("BF compare count for s2:" + p.indexBFCount(s2,t2,0));
        System.out.println("KMP compare count for s2:" + p.indexKMPCount(s2,t2,0));
    }
}
