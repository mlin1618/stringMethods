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
    }
}
