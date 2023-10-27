public class StringAlgos {
    
    // Reverse a string

    public String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i-- ) {
            result += s.charAt(i); // We cant use s[i]
        }

        

        return result;
    }


}
