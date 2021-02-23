package com.cola.binarysearchtree;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            bst.add(random.nextInt(10000));
        }

        ArrayList<Integer> nums = new ArrayList<>();
        while (!bst.isEmpty()) {
            nums.add(bst.removeMin());
        }

        System.out.println(nums);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) > nums.get(i)) {
                throw new IllegalArgumentException("Error");
            }
        }
        System.out.println("removeMin test completed");

//        int[] nums = {5, 3, 6, 8, 4, 2};
//        for (int i = 0; i < nums.length; i++) {
//            bst.add(nums[i]);
//        }
//
//        bst.preOrder();
//        System.out.println();
//
//        bst.preOrderNR();
//        System.out.println();
//
//        bst.inOrder();
//        System.out.println();
//
//        bst.postOrder();
//        System.out.println();
//
//        bst.levelOrder();
//        System.out.println();
//        System.out.println(bst);
    }
}
