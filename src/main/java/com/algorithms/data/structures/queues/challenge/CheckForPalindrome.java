package com.algorithms.data.structures.queues.challenge;

import java.util.Deque;
import java.util.LinkedList;

// check palindrome using queue(FIFO)

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
        Deque<Character> queue = new LinkedList<>();
        Deque<Character> stack = new LinkedList<>();

        input = input.toLowerCase();
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(c >= 'a' && c <= 'z') {
                queue.offer(c);
                stack.push(c);
            }
        }

        while(!queue.isEmpty()) {
            if(!stack.pop().equals(queue.poll())) {
                return false;
            }
        }
        return true;
    }

}
