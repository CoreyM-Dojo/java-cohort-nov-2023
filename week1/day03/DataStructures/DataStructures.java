import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DataStructures {

    // Fixed Arrays

    public int[] displayFixedArray() {

        String[] strArray = new String[6];
        System.out.println(Arrays.toString(strArray));

        int[] numArray = { 1, 2, 3, 4, 5, 6 };

        System.out.println(numArray.length);

        return numArray;
    }

    // ArrayList -> Dynamic Arrays
    public void displayDynamicArray(int[] numArray) {
        ArrayList<Integer> dynamicNumArray = new ArrayList<>();

        // Add to ArrayList - .add()
        dynamicNumArray.add(10);
        dynamicNumArray.add(20);
        dynamicNumArray.add(30);
        dynamicNumArray.add(40);
        dynamicNumArray.add(50);
        dynamicNumArray.add(0, 100);

        System.out.println(dynamicNumArray.size());

        // Changing values in an ArrayList
        dynamicNumArray.set(2, 300);

        // Remove a value from an ArrayList
        dynamicNumArray.remove(2);

        // get value in ArrayList
        dynamicNumArray.get(0);

        System.out.println(dynamicNumArray);

    }

    // Hashmaps = Objects = Dictionaries
    public void displayHashMap() {
        HashMap<String, String> names = new HashMap<>();

        // Add to HashMap
        names.put("0", "Zach");
        names.put("1", "Jamie");
        names.put("2", "Ryan");
        names.put("3", "Kyle");
        names.put("4", "Ahmad");

        // Getting value by keys
        String zach = names.get("0");
        System.out.println(zach);
        System.out.println(names);

        // keySet
        names.keySet(); // returns a set of the key names

        for (String key : names.keySet()) {
            System.out.println(names.get(key));
        }

        
    }

}
