package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileWriter writer = new FileWriter("Z:/JavaRush/JavaRushTasks/" + fileName, false);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        while (true) {
            String s = reader.readLine();
            bufferedWriter.write(s);
            if(s.equals("exit")) break;
            bufferedWriter.newLine();
        }

        reader.close();
        bufferedWriter.close();
    }
}
