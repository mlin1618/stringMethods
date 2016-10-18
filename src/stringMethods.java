/**
 * Created by ml996 on 10/18/16.
 */
public class stringMethods {

    public static void main(String[] args){
        //public String replace(String old, String new)
        //the replace method replaces all instances of String old in a String with String new
        //example
        String s = "test1234test";
        String s2 = s.replace("test", "...");
        System.out.println(s2); //prints out ...1234...
    }
}
