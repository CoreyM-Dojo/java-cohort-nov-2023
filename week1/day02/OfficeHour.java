public class OfficeHour {

    public static void main(String[] args) {
        System.out.println("Hello World");

        String myName = "Corey";

        String myOccupation = "Instructor";

        double drinkPrice = 3;

        boolean isOverPriced = false;

        if (drinkPrice > 2.00) {
            isOverPriced = true;
        } else {
            isOverPriced = false;
        }

        System.out.println(isOverPriced ? "This drink is way too expensive!" : "This drink is alright");
    }

}
