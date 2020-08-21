package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new Scanner(System.in).nextLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if(map.containsKey(data))
                map.replace(data, map.get(data) + 1);
            else
                map.put(data, 1);
        }
        inputStream.close();

        final int[] minCount = {Integer.MAX_VALUE};
        map.forEach((k,v)->{
            if (map.get(k) < minCount[0])
                minCount[0] = map.get(k);
        });

        map.forEach((k,v)->{
            if (map.get(k) == minCount[0])
                System.out.print(k + " ");
        });
    }
}
