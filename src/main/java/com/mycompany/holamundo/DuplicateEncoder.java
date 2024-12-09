/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import java.util.Objects;

/**
 * @author manana
 */
public class DuplicateEncoder {
    static String encode(String word) {
        char letter;
        String outWord = "";
        char searchLeft;
        char searchRight;

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            letter = word.charAt(i);
            search:
            for (int j = i + 1; j < word.length(); j++) {
                searchRight = word.charAt(j);
                if (searchRight == letter) {
                    outWord += ")";
                    break;
                }
                for (int k = i - 1; k > -1; k--) {
                    searchLeft = word.charAt(k);
                    if (searchLeft == letter) {
                        outWord += ")";
                        break search;
                    }
                }
            }
            if (i == word.length() - 1) {
                for (int k = word.length() - 2; k > -1; k--) {
                    searchLeft = word.charAt(k);
                    if (searchLeft == letter) {
                        outWord += ")";
                        break;
                    }
                }
            }
            if (i == outWord.length()) {
                outWord += "(";
            }
        }
        return outWord;
    }

    public static void main(String[] args) {
        String strToTest = "   ()(   ";
        String result = encode(strToTest);
        String resultStrTest = "))))())))";

        System.out.println(result);
        System.out.println(Objects.equals(result, resultStrTest));
        if (!Objects.equals(result, resultStrTest)) {
            System.out.println(resultStrTest);
        }
    }
}
