public class Intro {
    public static void main(String[] args) {

        System.out.println("Hello world my name is corey");

        // Data Types

        // ! Primitive

        // * int -> 10 -> cannot be nulled: 0
        // * double -> 10.6567 -> 0.0
        // * boolean -> true/false -> true
        // * char -> 'g' -> ''

        // Wrapper Classes

        // ! Object -> can be nulled
        // built in functions

        /*
         * Integer
         * Double
         * Long
         * String
         * Boolean
         * Character
         */

        // Variables -> datatype name = value
        Integer num = null;
        num = 20;
        // num = "Hello I'm corey"; // We cannot store a string in a variable meant for
        // a number

        // Operators
        /*
         * Mathematical
         * +,-, *, /, %
         * Comparison
         * <,>,==, >=,<=,!==
         * Logical
         * &&
         * ||
         * !
         */

        // Conditionals
        // if blank then blank else blank
        // if (condition) {
        // //do this if true
        // } else {
        // // do something else
        // }
        // Ternary -> condition ? result if the condition is true : result if condition
        // is false
        boolean isHungry = false;
        String exampleString = isHungry == true ? "I'm super hungry" : "I'm not very hungry right now";
        System.out.println(exampleString);

        // Loops

        // continue -> Skips current iteration of the loop
        // break -> ends the loop early

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            } else {
                System.out.println(i);
            }
        }
        // Switch
        rainbow("orange");

    }

    public static void rainbow(String color) {
        switch (color) {
            case "red":
                System.out.println("The next color is Orange");
                break;
            case "orange":
                System.out.println("The next color is Yellow");
            case "yellow":
                System.out.println("The next color is Green");
                break;
            case "green":
                System.out.println("The next color is Blue");
                break;
            case "blue":
                System.out.println("The next color is Indigo");
                break;
            case "indigo":
                System.out.println("The next color is violet");
                break;
            case "violet":
                System.out.println("You've reached the end");
                break;
                default:
                System.out.println("You have reached the end of the rainbow");
                break;
        }
    };

}
