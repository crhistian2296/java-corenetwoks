package com.mycompany.holamundo;

public class Stairs{
    public static String draw(int n){
        int spaces = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(" ".repeat(spaces) + "I");
            spaces++;
        }
        // do something
        return "";
    }

    public static void main(String[] args) {
        draw(3);
    }
}