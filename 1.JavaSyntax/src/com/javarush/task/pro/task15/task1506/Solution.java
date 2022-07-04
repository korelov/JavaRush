package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);
       String file = scanner.nextLine();

        List<String> list = Files.readAllLines(Paths.get(file));
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
        }
        System.out.println(stringBuilder.toString().replaceAll("[,. ]",""));
    }
}

