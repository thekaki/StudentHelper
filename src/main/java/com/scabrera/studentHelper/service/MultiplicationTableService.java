package com.scabrera.studentHelper.service;

import com.scabrera.studentHelper.util.ConsoleHelper;

public class MultiplicationTableService {
    public static void printTable(int num){
        ConsoleHelper.printTitle("Tabla del " + num);
        for (int i = 1; i <= 10; i++){
            int result = num * i;
            ConsoleHelper.printText(num + " x " + i + " = " + result);
        }
    }
}
