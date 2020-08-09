package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        if(n1 <= 0 || n2 <= 0)
            throw new Exception();
        System.out.println(NOD(n1, n2));
    }

    static int NOD(int a, int b) {
        while(a != 0 && b != 0) {
            if(a >= b)
                a = a % b;
            else
                b = b % a;
        }
        return a + b;
    }
}
