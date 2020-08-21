package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new Scanner(System.in).nextLine());
        int maxValue = Integer.MIN_VALUE;

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if(maxValue < data)
                maxValue = data;
        }
        inputStream.close();
        System.out.println(maxValue);
    }
}
