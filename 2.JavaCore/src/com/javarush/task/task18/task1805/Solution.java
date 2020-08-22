package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import static java.util.Comparator.naturalOrder;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new Scanner(System.in).nextLine());
        HashSet<Integer> set = new HashSet<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            set.add(data);
        }
        inputStream.close();
        ArrayList<Integer> list = new ArrayList<>(set);
        list.sort(naturalOrder());
        for (int i : list)
            System.out.print(i + " ");
    }
}
