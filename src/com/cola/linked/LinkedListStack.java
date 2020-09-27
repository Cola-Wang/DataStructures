package com.cola.linked;

import com.cola.stackandquene.Stack;

public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> list;

    public LinkedListStack() {
        this.list = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(list);
        return res.toString();
    }

    public static void main(String[] args) {
        // write your code here
        LinkedListStack<Integer> arr = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            arr.push(i);
            System.out.println(arr.toString());
        }

        arr.pop();
        System.out.println(arr.toString());
    }
}
