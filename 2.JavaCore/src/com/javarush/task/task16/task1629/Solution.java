package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {

    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        String out;

        @Override
        public void run() {
            try {
                String l1 = reader.readLine();
                String l2 = reader.readLine();
                String l3 = reader.readLine();

                out = l1 + " " + l2 + " " + l3;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void printResult(){
            System.out.println(out);
        }
    }
}
