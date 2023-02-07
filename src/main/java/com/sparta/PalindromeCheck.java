package com.sparta;

public class PalindromeCheck {


    public static String check(String word){
        String reverseWord = "";
        int stringLength = word.length();
        String output;

        if(stringLength >= 3) {
            for (int i = (stringLength - 1); i >= 0; --i) {
                reverseWord = reverseWord + word.charAt(i);
            }

            if (word.equals((reverseWord))) {
                output = word + " is a Palindrome";
            } else {
                output = word + " is not a Palindrome";
            }
        }
        else{
            output = "String must be 3 or more characters";
        }
        return output;
    }
}
