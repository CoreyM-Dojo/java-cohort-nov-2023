public class BooleanAlgos {
    
    public Boolean isPalindrome(String s) {

        // Given a string, return true if it is a palindrome (spelled the same backwards and forwards) otherwise return false

        // Create a container to hold all the letters that we loop through
        String result = "";

        // loop through our string backwards and add each letter to our container above
        // for (int i = s.length() - 1; i >= 0  ; i--) {
        //     result += s.charAt(i);
        // }

        int endCharIndex = s.length() - 1;
        int startCharIndex = 0;

        while (endCharIndex > startCharIndex) {

            if (s.charAt(startCharIndex) != s.charAt(endCharIndex)) {
                return false;
            }
            endCharIndex--;
            startCharIndex++;
        }

        return true;

    }
}
