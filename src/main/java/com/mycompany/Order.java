package com.mycompany;

import java.util.Arrays;

public class Order {
    public static void main(String[] args) {
        int [] a1= {9,5,7,1,4};
        int [] a2= {4,5,7,9,6,1};
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(a1[3]);
        System.out.println(a2[3]);
        System.out.println(Arrays.mismatch(a1, a2));
    }
}
