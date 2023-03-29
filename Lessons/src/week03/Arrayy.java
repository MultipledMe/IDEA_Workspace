package week03;

public class Arrayy {

    public static void main(String[] args) {
        int a[][] =new int [2][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int)(Math.random()*100);
                System.out.print( a[i][j]+" ");
            }
            System.out.println(" ");
        }


    }
}
