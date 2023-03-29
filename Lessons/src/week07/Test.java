package week07;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("wjq",19);
        Person p1 = new Person("pl",0);
        s1.sayhello();
        s1.nb();
        p1.nb();
        System.out.println("There had been "+Person.count+" stored in stack.");
    }
}
