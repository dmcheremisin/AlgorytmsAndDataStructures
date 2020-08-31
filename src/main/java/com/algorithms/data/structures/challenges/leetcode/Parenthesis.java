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

import java.util.List;

public class Parenthesis {

    public static void main(String[] args) {

    }

    public List<String> generateParenthesis(int n) {
        return null;
    }

}

//n=1
// 1
//"()"
//------------------
//1
//===============
//n=2
// 12
//"(())"
// 1 3
//"()()"
//------------------
//12, 13
//===============
//n=3
// 123
//"((()))",
// 12 4
//"(()())",
// 12  5
//"(())()",
// 1 34
//"()(())",
// 1 3 5
//"()()()"
//------------------
//123, 124, 125, 134, 135