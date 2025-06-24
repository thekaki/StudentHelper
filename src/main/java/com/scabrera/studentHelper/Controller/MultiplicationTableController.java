package com.scabrera.studentHelper.Controller;

import com.scabrera.studentHelper.service.MultiplicationTableService;
import com.scabrera.studentHelper.util.ConsoleHelper;

public class MultiplicationTableController {
    public static void showMenu(){
        do {
            ConsoleHelper.printTitle("Menu");
            ConsoleHelper.printOption(1, "Calcular tabla de multiplicar");
            ConsoleHelper.printOption(0, "Volver");
            int opcion = ConsoleHelper.readInt("Elige una opcion");

            if (opcion == 0) {
                break;
            }

            ConsoleHelper.printTitle("Herramienta generativa de tablas de multiplicar");
            int number = ConsoleHelper.readInt("Introduce la tabla que quieras calcular");
            MultiplicationTableService.printTable(number);
        } while (true);
    }
}
