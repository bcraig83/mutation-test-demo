package b3ls;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromeCheckerTest {
    @Test
    public void whenPalindrom_thenAccept() {
        PalindromeChecker palindromeTester = new PalindromeChecker();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }
}