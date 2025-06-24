package com.scabrera.studentHelper.service;

import com.scabrera.studentHelper.util.InputHelper;

public class CalculatorService {
    public static void calculadora() {
        do {
            System.out.println("""
                    Menú de operaciones:
                    1 - Suma
                    2 - Resta
                    3 - Multiplicación
                    4 - División
                    0 - Salir
                    Selecciona una operacion:
                    """);
            int opcion = InputHelper.readInt();

            int x = 0;
            int y = 0;

            if (opcion == 0) {
                break;
            }

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opcion invalida");
                continue;
            }

            System.out.println("Introduce un numero");
            x = InputHelper.readInt();
            System.out.println("Introduce otro numero");
            y = InputHelper.readInt();

            int resultado = performOperation(opcion, x, y);

            System.out.println("El resultado es " + resultado);
        } while (true);
    }

    private static int performOperation(int opcion, int x, int y) {
        return switch (opcion) {
            case 1 -> Calculator.add(x, y);
            case 2 -> Calculator.substract(x, y);
            case 3 -> Calculator.multiply(x, y);
            case 4 -> Calculator.divide(x, y);
            default -> throw new IllegalArgumentException("Opción inválida");
        };
    }
}
