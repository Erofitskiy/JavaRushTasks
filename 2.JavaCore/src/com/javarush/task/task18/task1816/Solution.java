package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(args[0])) {
            int symbol;
            int count = 0;
            while ((symbol = fileReader.read()) != -1) {
                if (symbolIsEnglishLetter(symbol)) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean symbolIsEnglishLetter(int symbol) {
        return (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z');
    }
}
