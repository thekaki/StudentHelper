package com.scabrera.studentHelper.Controller;

import com.scabrera.studentHelper.service.CalculatorService;
import com.scabrera.studentHelper.util.ConsoleHelper;

public class CalculatorController {
    public static void showMenu() {
        do {
            ConsoleHelper.printTitle("Menu de operaciones");
            ConsoleHelper.printOption(1, "Suma");
            ConsoleHelper.printOption(2, "Resta");
            ConsoleHelper.printOption(3, "Multiplicacion");
            ConsoleHelper.printOption(4, "Division");
            ConsoleHelper.printOption(0, "Volver");
            int opcion = ConsoleHelper.readInt("Selecciona una opcion");

            int x = 0;
            int y = 0;

            if (opcion == 0) {
                break;
            }

            if (opcion < 1 || opcion > 4) {
                ConsoleHelper.printTitle("Opcion invalida");
                continue;
            }

            x = ConsoleHelper.readInt("Introduce un numero");
            y = ConsoleHelper.readInt("Introduce otro numero");

            int resultado = performOperation(opcion, x, y);

            ConsoleHelper.printText("El resultado es " + resultado);
        } while (true);
    }

    private static int performOperation(int opcion, int x, int y) {
        return switch (opcion) {
            case 1 -> CalculatorService.add(x, y);
            case 2 -> CalculatorService.substract(x, y);
            case 3 -> CalculatorService.multiply(x, y);
            case 4 -> CalculatorService.divide(x, y);
            default -> throw new IllegalArgumentException("Opción inválida");
        };
    }
}
