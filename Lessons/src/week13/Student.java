package week13;

import java.io.Serializable;

//需要实现序列化，持久保存的数据类型，必须实现Serializable
public class Student implements Serializable {
    String name;
    int age;
    Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
}
