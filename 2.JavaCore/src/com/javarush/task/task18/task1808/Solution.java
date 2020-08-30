package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream  file1 = new FileInputStream (fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);
        FileOutputStream file3 = new FileOutputStream(fileName3);

        int lengthSecondFile;

        while (file1.available() > 0) {

            if (file1.available() % 2 == 0) {
                lengthSecondFile = file1.available() / 2;
            } else
                lengthSecondFile = file1.available() / 2 + 1;

            byte[] bufferForSecondFile = new byte[lengthSecondFile];
            byte[] bufferForThreadFile = new byte[file1.available() / 2];

            file2.write(bufferForSecondFile, 0, file1.read(bufferForSecondFile));
            file3.write(bufferForThreadFile, 0, file1.read(bufferForThreadFile));
        }
        reader.close();
        file1.close();
        file2.close();
        file3.close();
    }
}
