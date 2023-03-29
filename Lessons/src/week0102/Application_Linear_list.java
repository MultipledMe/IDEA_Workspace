package week0102;
import java.util.Scanner;
//alpha list refers to one sequence list consisted
//with{'a','z','d','m','z'}
public class Application_Linear_list {
    public static void main(String[] args) throws Exception {
        Sequence_list Alpha_list = new Sequence_list(10);
        Alpha_list.insert(0,'a');
        Alpha_list.insert(1,'z');
        Alpha_list.insert(2,'d');
        Alpha_list.insert(3,'m');
        Alpha_list.insert(4,'m');//fill the list

        int found_index = Alpha_list.indexOf('z');
        if(found_index != -1)
            System.out.println("Foremost corresponding index of 'z' is " + found_index);
        else
            System.out.println("This sequence list does not include 'z'");

        int i ;
        System.out.println("Input wanna_find_index");
        Scanner KeyboardInput = new Scanner(System.in);
        i = KeyboardInput.nextInt();
        Alpha_list.get(i);
        if(i == -1)
            System.out.println("This sequence does not include index 'i' element");
        else
            System.out.println("Location at 'i' equals " + Alpha_list.get(i));
    }
}
