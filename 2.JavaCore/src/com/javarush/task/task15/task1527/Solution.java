package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        ArrayList<String> params = new ArrayList<>();
        ArrayList<String> Args = new ArrayList<>();
        String temp = "";

        String[] t = line.substring(line.indexOf('?') + 1).split("&");

        for(String s : t){
            if(!s.contains("="))
                params.add(s);
            else{
                int index = s.indexOf('=');
                params.add(s.substring(0, index));
                if("obj".equals(s.substring(0, index)))
                    Args.add(s.substring(index+1));
            }
        }

        for (int i = 0; i < params.size() - 1; i++) {
            temp = temp + params.get(i) + " ";
        }
        temp += params.get(params.size() - 1);
        System.out.println(temp);
        for (String tt : Args){
            try{
                alert(Double.parseDouble(tt));
            } catch (Exception e){
                alert(tt);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
