package exp1;

public class A {
    public static void main(String[] args) {
        System.out.println("class A is running.");
        A.Fun();
        B.Fun1();
    }
    static void Fun(){
        System.out.println("Fun() insides A is running.");
    }
}
