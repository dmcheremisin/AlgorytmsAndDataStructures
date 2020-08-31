package com.algorithms.data.structures.challenges.leetcode;

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//For example, given n = 3, a solution set is:
//[
//  "((()))",
//  "(()())",
//  "(())()",
//  "()(())",
//  "()()()"
//]

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Parenthesis {

    public static void main(String[] args) {
        generateParenthesis(2);
    }

    public static List<String> generateParenthesis(int n) {
        int length = 2 * n;
        Set<List<Integer>> sets = new HashSet<>();

        int i = 1;
        while (i < n + 1) {
            System.out.println(i);
            i++;
        }
        return null;
    }

    public List<Integer> getIndexes(int initialIndex, int n) {
        List<Integer> nums = new ArrayList<Integer>();
        int i = initialIndex;
        while (i < 2 * n - 2) {
            nums.add(i);
            i++;
        }

        return nums;
    }

}

//n=1
// 0
//"()"
//------------------
//0
//===============
//n=2
// 01
//"(())"
// 0 2
//"()()"
//------------------
//01, 02
//===============
//n=3
// 012
//"((()))",
// 01 3
//"(()())",
// 01  4
//"(())()",
// 0 23
//"()(())",
// 0 2 4
//"()()()"
//------------------
//012, 013, 014, 023, 024
// 2 = n - 1 (elements available for storage)
// 2(border index, no more combinations on it) =
//                                       2n - 2(last index) - (n - 1)(elements to store in string, first always 0) = n - 1