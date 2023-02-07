package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckTest {
    @ParameterizedTest
    @ValueSource(strings = {"radar", "madam", "racecar", "civic"})
    @DisplayName("Given a Palindrome, PalindromeCheck returns word + is a Palindrome")
    public void GivenAPalindrome_PalindromeCheck_ReturnsWordIsAPalindrome(String word){
        String expected = word + "is a Palindrome";
        String result = PalindromeCheck.check(word);
    }

    @ParameterizedTest
    @ValueSource(strings = {"liam", "juice", "glass", "java"})
    @DisplayName("Given a Palindrome, PalindromeCheck returns word + is a Palindrome")
    public void GivenNotAPalindrome_PalindromeCheck_ReturnsWordIsNotAPalindrome(String word){
        String expected = word + "is not a Palindrome";
        String result = PalindromeCheck.check(word);
    }
}