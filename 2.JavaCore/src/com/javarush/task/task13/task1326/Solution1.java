package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла


Всё верно, однако системе такой код не нравится, и она не пропускает.


*/

import java.io.*;
import java.util.ArrayList;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream("Z:/JavaRush/JavaRushTasks/" + fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader buffReader = new BufferedReader(inputStreamReader);

        ArrayList<Integer> oddInts = new ArrayList<>();
        while (buffReader.ready()) {
            int t = Integer.parseInt(buffReader.readLine());
            //System.out.println(t);
            if(t % 2 == 0){
                if(oddInts.size() == 0){
                    oddInts.add(t);}
                else for (int i = 0; i < oddInts.size(); i++) {
                    if(t < oddInts.get(i)){
                        oddInts.add(i, t);
                        break;
                    } else if(i+1 == oddInts.size()) {
                        oddInts.add(t);
                        break;
                    }
                }
            }
        }
        //System.out.println(oddInts);
        for(int x : oddInts)
            System.out.println(x);

        inputStreamReader.close();
        buffReader.close();
        reader.close();
    }
}
