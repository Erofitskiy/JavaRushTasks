package com.javarush.task.task15.task1519;

import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String key;

        while(true){
            key = scanner.nextLine();
            if ("exit".equals(key))
                break;

            try
            {
                if (key.contains("."))
                {
                    double d = Double.parseDouble(key);
                    print(d);
                }
                else if (Integer.parseInt(key) > 0 && Integer.parseInt(key) < 128)
                {
                    short c = Short.parseShort(key);
                    print(c);
                } else if (Integer.parseInt(key) <= 0 || Integer.parseInt(key) >= 128)
                {
                    Integer c = Integer.parseInt(key);
                    print(c);
                }
            }
            catch (Exception io)
            {
                print(key);
            }
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
