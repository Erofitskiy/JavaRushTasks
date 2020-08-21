package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new Scanner(System.in).nextLine());
        int minValue = Integer.MAX_VALUE;

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if(minValue > data)
                minValue = data;
        }
        inputStream.close();
        System.out.println(minValue);
    }
}
