package com.javarush.task.task18.task1825;

/*
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String resultName = "";
        while (true) {
            String str = br.readLine();
            if (str.equals("end")) break;
            String[] mStr = str.split("\\.");
            String lastStr = mStr[mStr.length - 1];
            int index = Integer.parseInt(lastStr.substring(4, lastStr.length()));
            map.put(index, str);
            if (resultName.equals("")) {
                resultName = "";
                for (int i = 0; i < mStr.length-1; i++) {
                    resultName = resultName + (resultName.equals("") ? "" : ".") + mStr[i];
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(resultName));
        byte[] buff = new byte[100];
        for (int i : list) {
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(map.get(i)))){
                while (true) {
                    int count = bis.read(buff);
                    if (count < 0) break;
                    bos.write(buff, 0, count);
                }
            }
        }
        bos.close();
    }
}