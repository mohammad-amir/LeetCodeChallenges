package de.mohammadamir;

// Valid Parenthesis String
// https://leetcode.com/problems/valid-parenthesis-string/
public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        int maxOpen = 0;
        int minOpen = 0;

        for(char c: s.toCharArray()){
            if(c == '(') {
                minOpen++;
            }  else {
                minOpen--;
            }

            if(c != ')') {
                maxOpen++;
            } else {
                maxOpen--;
            }

            if(maxOpen < 0) {
                return false;
            }

            minOpen = Math.max(0, minOpen);
        }

        return minOpen == 0;
    }
}
