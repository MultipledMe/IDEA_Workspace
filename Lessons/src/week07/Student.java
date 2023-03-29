package week07;

public class Student extends Person{
    Student(String name, int age) {
        super(name,age);
//        System.out.println(count);
        countt();
    }

    @Override
    void nb(){
        System.out.println("nb() of subclass[Student]");
    }




}
