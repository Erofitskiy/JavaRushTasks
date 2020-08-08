package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream in = new FileInputStream(fileName); //Z:/JavaRush/JavaRushTasks/someFile.txt

        while(in.available()>0) {
            System.out.write(in.read());
        }
        System.out.println();

        in.close();
        reader.close();
    }
}