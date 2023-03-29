package week10;

public class SplitString {
    public static void main(String[] args) {
        String regex ="[,.]+";//regular expression
        String poem = "I love three things in the world.Sun,Moon,And you.Sun for Daytime,Moon for Night.And you Forever.";
        String [] poemm = poem.split(regex);
        for(String a:poemm){
            System.out.println(a);
        }
    }

}
