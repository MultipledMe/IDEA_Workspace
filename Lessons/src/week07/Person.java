package week07;

public class Person {
    String name;
    int age;
    protected static int count = 0;//protected修饰符限定只能由包内类使用
    private String namee;
    void sayhello(){
        System.out.println("hello");
    }
    //void sayhelloo(){
    //    System.out.println("helloo"+this.namee);
    //}
    //void non_parameter_constructor(){
    //    System.out.println("This is a non parameter constuctor.");
    //}
    void countt(){
        count++;
    }
    void nb(){
        System.out.println("nb() of Superclass[Person]");
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
        countt();
    }


}
