package com.derylspielman.problems;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author dev
 */
public class PalindromeTest {
    
    public PalindromeTest() {
    }

    @Test
    public void isPalindrome_aba_True() {
        assertTrue(new Palindrome().isPalindrome("aba"));
    }
    
    @Test
    public void isPalindrome_baa_False() {
        assertFalse(new Palindrome().isPalindrome("baa"));
    }
    @Test
    public void isPalindromeWhileLoop_aba_True() {
        assertTrue(new Palindrome().isPalindromeWhileLoop("aba"));
    }
    
    @Test
    public void isPalindromeWhileLoop_baa_False() {
        assertFalse(new Palindrome().isPalindromeWhileLoop("baa"));
    }
    
}
