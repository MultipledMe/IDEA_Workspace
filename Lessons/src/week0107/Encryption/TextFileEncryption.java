package week0107.Encryption;

import week0107.SeqString;

import java.io.*;

public class TextFileEncryption extends SeqString {
    public void encryptFile(SeqString originalfilename, SeqString encryptedfilename, int key) throws IOException{
        FileReader fin = new FileReader(originalfilename.toString());
        BufferedReader bin = new BufferedReader(fin);
        FileWriter fout = new FileWriter(encryptedfilename.toString());
        SeqString encryptedline;
        String aline;
        SeqString textline;

        do {
            aline = bin.readLine();
            if (aline != null){
                textline = new SeqString(aline);
                encryptedline = jiaMi(textline,key);
                fout.write(encryptedline.toString() + "\r\n");
            }
        }while (aline !=null);
        bin.close();
        fin.close();
        fout.close();
    }
    public void decryptFile(SeqString encrytedfilename, SeqString originalfilename, int key) throws IOException
    {
        FileReader fin = new FileReader(encrytedfilename.toString());
        BufferedReader bin = new BufferedReader(fin);
        FileWriter fout = new FileWriter(originalfilename.toString());
        SeqString decryptedline;
        String aline;
        SeqString textline;
        do {
            aline = bin.readLine();
            if (aline != null){
                textline = new SeqString(aline);
                decryptedline = jieMi(textline, key);
                fout.write(decryptedline.toString());
            }
        }while (aline != null);
        bin.close();
        fin.close();
        fout.close();
    }
    private SeqString jiaMi(SeqString s, int key) {
        SeqString str = new SeqString();
        int ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i) ^ (((int)Math.sqrt(key)) % 126 + 1);
            if (ch == 13){
                ch = ch + 1;
            }
            if (ch == 10){
                ch = ch + 1;
            }
            str.concat((char)ch);
        }
        return str;
    }
    private SeqString jieMi(SeqString s, int key){
        SeqString str = new SeqString();
        int ch,temp;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if (temp == 14){
                temp = temp - 1;
            }
            if (temp == 11){
                temp = temp - 1;
            }
            ch = temp ^(((int)Math.sqrt(key) % 126 + 1));
            str.concat((char)ch);
        }
        return str;
    }
}
