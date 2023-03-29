package week11;

public class CollegeStudent extends Student{
    String major;
    public CollegeStudent(String name,String id,String major){
        super(name,id);
        this.major=major;
    }
}
