package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        if("helicopter".equals(key))
            result = new Helicopter();
        if("plane".equals(key)){
            int n = scanner.nextInt();
            result = new Plane(n);
        }
        scanner.close();

    }
}
