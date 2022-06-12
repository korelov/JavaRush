package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity = capacity + capacity / 2;
        String[] temp = new String[capacity];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements=new String[capacity];
        System.arraycopy(temp, 0, elements, 0, elements.length);
    }

}
