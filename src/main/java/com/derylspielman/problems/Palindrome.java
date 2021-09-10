package com.derylspielman.problems;

/**
 *
 */
public class Palindrome {

    public boolean isPalindrome(String text) {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char left = chars[i];
            int rightIndex = chars.length - 1 - i;
            char right = chars[rightIndex];
            if (i == rightIndex) {
                break;
            }
            if (left != right) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindromeWhileLoop(String text) {
        char[] chars = text.toCharArray();

        int leftIndex = 0;
        int rightIndex = text.length() - 1;
        while (leftIndex < rightIndex) {
            if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }

        return true;
    }

}
