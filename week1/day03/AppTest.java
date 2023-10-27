

public class AppTest {
    
    public static void main(String[] args) {
        
        StringAlgos stringTest = new StringAlgos();
        BooleanAlgos booleanTest = new BooleanAlgos();
        NumberAlgos numberTest = new NumberAlgos();

        System.out.println(stringTest.reverseString("flubbernuggest"));
        System.out.println(booleanTest.isPalindrome("racecar"));
        System.out.println(booleanTest.isPalindrome("palindrome"));
    }
}
