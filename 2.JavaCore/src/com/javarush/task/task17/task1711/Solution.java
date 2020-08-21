package com.javarush.task.task17.task1711;

import java.text.*;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]) {

            case "-c":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length; i++) {
                        if (args[i].equals("м")) {
                            date = simpleDateFormat.parse(args[i + 1]);
                            allPeople.add(Person.createMale(args[i - 1], date));
                            System.out.println(allPeople.size() - 1);
                        }
                        else if (args[i].equals("ж")) {
                            date = simpleDateFormat.parse(args[i + 1]);
                            allPeople.add(Person.createFemale(args[i - 1], date));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 4)
                        uParam(args[i], args[i + 1], args[i + 2], args[i + 3]);
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++)
                        dParam(args[i]);
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++)
                        iParam(args[i]);
                }
                break;
        }
    }
    static Date simpleDataFormat(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date tempDate = new Date();
        try {
            tempDate = format.parse(date);
        } catch (ParseException e) {
        }
        return tempDate;
    }

    static void cParam(String name, String sex, String bd) {

        if (sex.equals("м")) {
            allPeople.add(Person.createMale(name, simpleDataFormat(bd)));
        } else if (sex.equals("ж")) {
            allPeople.add(Person.createFemale(name, simpleDataFormat(bd)));
        }
        System.out.println(allPeople.size() - 1);
    }

    static void uParam(String id, String name, String sex, String bd) {

        int index = Integer.parseInt(id);
        allPeople.get(index).setName(name);
        if (sex.equals("м")) {
            allPeople.get(index).setSex(Sex.MALE);
        } else if (sex.equals("ж")) {
            allPeople.get(index).setSex(Sex.FEMALE);
        }
        allPeople.get(index).setBirthDate(simpleDataFormat(bd));
    }

    static void dParam(String id) {
        int index = Integer.parseInt(id);
        allPeople.get(index).setName(null);
        allPeople.get(index).setSex(null);
        allPeople.get(index).setBirthDate(null);
    }

    static void iParam(String i) {
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        int id = Integer.parseInt(i);
        if (allPeople.get(id).getSex() == Sex.MALE) {
            System.out.println(allPeople.get(id).getName() + " " + "м" + " "
                    + simpleDate.format(allPeople.get(id).getBirthDate()));
        }
        else if (allPeople.get(id).getSex() == Sex.FEMALE) {
            System.out.println(allPeople.get(id).getName() + " " + "ж" + " "
                    + simpleDate.format(allPeople.get(id).getBirthDate()));
        }
    }
}
