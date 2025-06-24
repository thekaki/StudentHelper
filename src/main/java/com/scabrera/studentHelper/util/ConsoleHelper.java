package com.scabrera.studentHelper.util;

import java.util.Scanner;

public class ConsoleHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static void printTitle(String title) {
        System.out.println("=== " + title + " ===");
    }

    public static void printOption(int number, String description) {
        System.out.println(number + " - " + description);
    }

    public static void printText(String prompt){
        System.out.println(prompt);
    }

    public static int readInt(String prompt) {
        System.out.print(prompt + ": ");
        int num = scanner.nextInt();
        scanner.nextLine(); // limpia buffer
        return num;
    }

    public static String readLine(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    public static void close() {
        scanner.close();
    }
}