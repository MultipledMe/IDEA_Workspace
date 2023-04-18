package week0107;;

public class SeqString implements IString{
  private char[] strvalue;
  private int curLen;
  
  public SeqString(){
    strvalue = new char[0];
    curLen = 0;
  }

  public SeqString(String str){
    char[] tempchararray = str.toCharArray();
    strvalue = tempchararray;
    curLen = tempchararray.length;
  }
  public SeqSting(char[] value){
    this.strvalue = new SeqString(value:length);
    for (int i = 0; i < value.length; i++) {
        this.strvalue[i] = value[i];
    }
    curLen = value.length;
  }
  public void clear(){
    this.curLen = 0;
  }
  public boolean isEmpty(){
    return curLen == 0;
  }

}