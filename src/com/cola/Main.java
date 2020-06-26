package com.cola;

import com.cola.array.Array;
import com.cola.stackandquene.ArrayStack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayStack<Integer> arr = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            arr.push(i);
            System.out.println(arr.toString());
        }

        arr.pop();
        System.out.println(arr.toString());
    }
}
