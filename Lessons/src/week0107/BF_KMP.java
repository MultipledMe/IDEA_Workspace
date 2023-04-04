package week0107;

public class BF_KMP {
    public int indexBFCount(SeqString s,SeqString t,int begin){
        int slen,tlen, i = begin,j = 0;
        int count = 0;
        slen = s.length();
        tlen = t.length();
        while ((i < slen) & (j < tlen)){
            if(s.charAt(i)  ==t.charAt(j)){
                i++;
                j++;
            } else{
                i = i -j + 1;
                j = 0;
            }
            count++;
        }
        return count;
    }
    public int indexKMPCount(SeqString s,SeqString t, int begin){
        int[] next = getNext(t);
        int i = begin;
        int j = 0;
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
        return count;
    }
    public int[] getNext(SeqString T){
        int[] next = new int[T.length()];
        int j = 1;
        int k = 0;
        next[0] = -1;
        next[1] = 0;
        while (j <T.length() - 1){
            if (T.charAt(j)) == T.charAt(k)){
                next[j + 1] = k + 1;
                j++;
                k++;
            }
        }
    }
}
