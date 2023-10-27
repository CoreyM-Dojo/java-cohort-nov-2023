
public class AppTest {

    
    public static void main(String[] args) {
        System.out.println("Hello World");
        DataStructures testApp = new DataStructures();

        int [] numArray = testApp.displayFixedArray();
        testApp.displayDynamicArray(numArray);
        testApp.displayHashMap();
    }
    
}
