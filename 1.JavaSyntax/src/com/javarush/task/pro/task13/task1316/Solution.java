package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] javarushQuest = JavarushQuest.values();
        for (int i = 0; i < javarushQuest.length; i++) {
            System.out.println(javarushQuest[i].ordinal());
        }
    }
}
