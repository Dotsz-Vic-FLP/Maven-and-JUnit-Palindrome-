package org.example;

public class StrUtils {
    /**
     * Determines if a given string is a palindrome.
     * Ignores case and non-alphanumeric characters.
     *
     * @param s the string to test
     * @return true if the string is a palindrome, false otherwise
     */
    public static Boolean isPalindrome(String s) {

        if (s == null){
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        if (s.length() == 1) {
            return true;
        }

        String sCleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // remove non-alphanumeric characters and convert to lower case

        int left = 0;
        int right = sCleaned.length() - 1 ;

        while (left < right) { // check per character from left and right
            char leftCharacter = sCleaned.charAt(left);
            char rightCharacter = sCleaned.charAt(right);

            if (leftCharacter != rightCharacter) {
                return false;
            }

            left ++;
            right --;
        }

    return true; // if all characters are checked then return true
    }

}


/*Pseudocode
    check per character from left and right
    if both are same then continue
    else return false
    if all characters are checked then return true

    check for null and empty string
    remove non-alphanumeric character
    ignore case
 */
