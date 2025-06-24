package com.scabrera.studentHelper.util;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readLine() {
        return scanner.nextLine();
    }

    public static int readInt() {
        return scanner.nextInt();
    }

    public static void closeScanner() {
        scanner.close();
    }
}
