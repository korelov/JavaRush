package com.javarush.task.pro.task15.task1504;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();

        try (
                var inputStream = Files.newInputStream(Paths.get(file1));
                var outputStream = Files.newOutputStream(Paths.get(file2));
        ) {
            byte[] buffer = inputStream.readAllBytes();
            byte[] bufferOut = new byte[buffer.length];
            for (int i = 0; i < buffer.length; i++) {
                if (i < buffer.length - 1) {
                    bufferOut[i] = buffer[i + 1];
                    bufferOut[i + 1] = buffer[i];
                    i++;
                } else {
                    bufferOut[i] = buffer[i];
                }
            }
            outputStream.write(bufferOut);
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

