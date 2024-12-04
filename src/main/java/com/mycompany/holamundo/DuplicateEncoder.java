/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

/**
 * @author manana
 */
public class DuplicateEncoder {
    static String encode(String word) {
        char letter;
        String outWord = "";

        for (int i = 0; i < word.length(); i++) {
            letter = word.charAt(i);
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(j) == letter) {
                    outWord += ")";
                    break;
                }
                for (int k = j - 1; k > 0; k--) {
                    if (word.charAt(k) == letter) {
                        outWord += ")";
                        break;
                    }
                }
            }
            if (i == outWord.length()) outWord += "(";
        }
        return outWord;
    }

    public static void main(String[] args) {
        System.out.println(encode("papa"));
    }
}
