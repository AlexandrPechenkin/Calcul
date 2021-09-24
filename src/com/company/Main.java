package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws WrongNumberException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String string = scanner.nextLine();
            String[] numbers;
            if (string.contains("I") || string.contains("V") || string.contains("X")) {
                if (string.indexOf('+') > 0) {
                    numbers = string.split(("[+]"));
                    int first = RomanNumeral.valueOf(numbers[0]).getValue();
                    int second = RomanNumeral.valueOf(numbers[1]).getValue();
                    if (first > 10 || second > 10 || first < 1 || second < 1) {
                        throw new WrongNumberException("Число не входит в диапозон от 1 до 10");
                    }
                    System.out.println(RomanNumeral.values()[(first + second) - 1]);
                } else if (string.indexOf('-') > 0) {
                    numbers = string.split(("[-]"));
                    int first = RomanNumeral.valueOf(numbers[0]).getValue();
                    int second = RomanNumeral.valueOf(numbers[1]).getValue();
                    if (first > 10 || second > 10 || first < 1 || second < 1) {
                        throw new WrongNumberException("Число не входит в диапозон от 1 до 10");
                    }
                    System.out.println(RomanNumeral.values()[(first - second) - 1]);
                } else if (string.indexOf('*') > 0) {
                    numbers = string.split(("[*]"));
                    int first = RomanNumeral.valueOf(numbers[0]).getValue();
                    int second = RomanNumeral.valueOf(numbers[1]).getValue();
                    if (first > 10 || second > 10 || first < 1 || second < 1) {
                        throw new WrongNumberException("Число не входит в диапозон от 1 до 10");
                    }
                    System.out.println(RomanNumeral.values()[(first * second) - 1]);
                } else if (string.indexOf('/') > 0) {
                    numbers = string.split(("[/]"));
                    int first = RomanNumeral.valueOf(numbers[0]).getValue();
                    int second = RomanNumeral.valueOf(numbers[1]).getValue();
                    if (first > 10 || second > 10 || first < 1 || second < 1) {
                        throw new WrongNumberException("Число не входит в диапозон от 1 до 10");
                    }
                    System.out.println(RomanNumeral.values()[(first / second) - 1]);
                } else {
                    System.out.println("Неверное выражение");
                }
            } else {

                if (string.indexOf('+') > 0) {
                    numbers = string.split("[+]");
                    if (Integer.parseInt(numbers[0]) > 10 || Integer.parseInt(numbers[1]) > 10 ||
                            Integer.parseInt(numbers[0]) < 1 || Integer.parseInt(numbers[1]) < 1) {
                        throw new WrongNumberException("Число не входит в диапозон от 1 до 10");
                    }
                    System.out.println(Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
                } else if (string.indexOf('-') > 0) {
                    numbers = string.split("[-]");
                    if (Integer.parseInt(numbers[0]) > 10 || Integer.parseInt(numbers[1]) > 10 ||
                            Integer.parseInt(numbers[0]) < 1 || Integer.parseInt(numbers[1]) < 1) {
                        throw new WrongNumberException("Число не входит в диапозон от 1 до 10");
                    }
                    System.out.println(Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]));
                } else if (string.indexOf('*') > 0) {
                    numbers = string.split("[*]");
                    if (Integer.parseInt(numbers[0]) > 10 || Integer.parseInt(numbers[1]) > 10 ||
                            Integer.parseInt(numbers[0]) < 1 || Integer.parseInt(numbers[1]) < 1) {
                        throw new WrongNumberException("Число не входит в диапозон от 1 до 10");
                    }
                    System.out.println(Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]));
                } else if (string.indexOf('/') > 0) {
                    numbers = string.split("[/]");
                    if (Integer.parseInt(numbers[0]) > 10 || Integer.parseInt(numbers[1]) > 10 ||
                            Integer.parseInt(numbers[0]) < 1 || Integer.parseInt(numbers[1]) < 1) {
                        throw new WrongNumberException("Число не входит в диапозон от 1 до 10");
                    }
                    System.out.println(Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]));
                } else {
                    System.out.println("Неверное выражение");
                }
            }
        }
    }
}
