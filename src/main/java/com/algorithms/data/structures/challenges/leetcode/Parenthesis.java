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
//
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
//      2n - 2(last index) - (n - 1)(elements to store in string, first always 0) = n - 1

import java.util.List;

public class Parenthesis {

    public static void main(String[] args) {
        new Parenthesis().generateParenthesis(4);
    }

    public List<String> generateParenthesis(int n) {
        int lastIndex = 2 * n - 1;
        getIntegers(0, 0, n, lastIndex);
        return null;
    }

    private void getIntegers(int itemNumber, int position, int n, int lastIndex) {
        if (itemNumber >= n || position >= (lastIndex - 1))
            return;
        System.out.println("========> Item number: " + itemNumber);
        int borderIndex = lastIndex - 2 * (n - itemNumber) + 1;
        for (int i = position; i <= borderIndex; i++) {
            System.out.println("Item number: " + itemNumber + " position: " + i);
            getIntegers(itemNumber + 1, position + 1, n, lastIndex);
        }
    }
}
