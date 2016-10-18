/**
 * Created by ml996 on 10/18/16.
 */
import java.util.Scanner;
public class stringMethods {

    public static void main(String[] args){
        //public String replace(String old, String new)
        //the replace method replaces all occurrences of String old in the string with String new
        //then returns the new string

        //example
        String s = "test1234test";
        String s2 = s.replace("test", "...");
        System.out.println(s2); //prints out ...1234...

        //usage in simplistic program
        //Program that does the Find+Replace function of Microsoft Word
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        System.out.println("Enter the string you want to replace");
        String replace1 = sc.nextLine();
        System.out.println("Enter what you want to replace it with");
        String new1 = sc.nextLine();
        System.out.println(original.replace(replace1, new1));
    }
}
