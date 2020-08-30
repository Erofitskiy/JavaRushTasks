package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.*;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length == 0)
            return;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                String line;
                int maxId = 0;
                List<String> list = new ArrayList<>();
                while ((line = fileReader.readLine()) != null) {
                    list.add(line);
                    int id = Integer.parseInt(line.substring(0, 8).trim());
                    if (maxId < id) {
                        maxId = id;
                    }
                }

                try (FileOutputStream fos = new FileOutputStream(fileName)) {
                    for (String s : list)
                        fos.write((String.format("%s%n", s)).getBytes());
                    fos.write(String.format("%-8s%-30s%-8s%-4s%n", ++maxId, args[1], args[2], args[3]).getBytes());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
