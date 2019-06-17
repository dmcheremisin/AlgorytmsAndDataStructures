package com.algorithms.data.structures.stacks.challenge;

import java.util.Deque;
import java.util.LinkedList;

// check palindrome using stack or LIFO principle

public class CheckForPalindrome {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    private static boolean checkForPalindrome(String input) {
        input = input.replaceAll("\\W", "");
        Deque<Character> list = new LinkedList<>();
        for (char aChar : input.toCharArray()) {
            list.push(aChar);
        }
        StringBuilder reverseInput = new StringBuilder();
        while (!list.isEmpty()) {
            reverseInput.append(list.pop());
        }
        return reverseInput.toString().equalsIgnoreCase(input);
    }

}
