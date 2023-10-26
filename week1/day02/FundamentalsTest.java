// package week1.day02;
public class FundamentalsTest {
    // There should only be one main method in every application
    public static void main(String[] args) {

        // Dependency Injection
        Fundamentals test = new Fundamentals();
        test.greeting();

         // Strings

    String myString = "My name is";
    String name = "George";



    // String concatenation
    String result = myString + " " + name; // My name is George
    result = myString.concat(name); // My name isGeorge
    result = "I love %s but please call %d";
    // String.format -> string to work with, the variable or value to inject into that string
    String formattedString = String.format(result , "rabies", 911);
    System.out.println(formattedString);
    
    // Equality check
    String string1 = "this";
    String string2 = new String("this");

    System.out.println(string1 == string2);
    System.out.println(string1.equals(string2));

        int countingNum = test.countAndSum(10);
        System.out.println(countingNum);
    }
}
