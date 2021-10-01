package com.nitincodes;

public class ArrayAsAparameter {
    public static void main(String[] args) {
        int[] arr = {13,24,35,67,46};
        System.out.println(arr[0]);
        System.out.println(method1(arr));

    }
    static int  method1(int[] s){
        return s[0]=12;
    }
}
