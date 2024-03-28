import org.example.StrUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrUtilsTests {

    @Test
     void TestPalindromeWithEmptyString() {
        assertTrue(StrUtils.isPalindrome(""));
    }

    @Test
    void TestPalindromeWithNull(){
        assertFalse(StrUtils.isPalindrome(null));
    }

    @Test
    void TestPalindromeWithSingleCharacter(){
        assertTrue(StrUtils.isPalindrome("a"), "Single 'a' letter should be considered a palindrome");
        assertTrue(StrUtils.isPalindrome("A"));
        assertTrue(StrUtils.isPalindrome("1"), "Single number '1' should be considered a palindrome");
        assertTrue(StrUtils.isPalindrome("!"), "Single character '1' should be considered a palindrome" );
        assertTrue(StrUtils.isPalindrome("j"));
    }

    @Test
    void TestPalindromeIgnoringCase(){
        assertTrue(StrUtils.isPalindrome("Madam"));
        assertTrue(StrUtils.isPalindrome("mAdAm"));
        assertTrue(StrUtils.isPalindrome("madaM"));
    }
    @Test
    void TestPalindromeIgnoringNonAlphanumericCharacters() {
        assertTrue(StrUtils.isPalindrome(("Was it a car or a cat I saw?")));
        assertTrue(StrUtils.isPalindrome("!Was it a#car@or a cat&I saw?"));
        assertTrue(StrUtils.isPalindrome("Race Car!"));
    }
}
