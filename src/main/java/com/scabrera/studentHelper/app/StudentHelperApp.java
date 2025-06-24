package com.scabrera.studentHelper.app;

import com.scabrera.studentHelper.Controller.MultiplicationTableController;
import com.scabrera.studentHelper.model.Estudiante;
import com.scabrera.studentHelper.model.Profesor;
import com.scabrera.studentHelper.Controller.CalculatorController;
import com.scabrera.studentHelper.util.ConsoleHelper;

public class StudentHelperApp {
    public static void run() {
        menuIdentidad();
        ConsoleHelper.close();
    }

    private static void menuIdentidad(){
        ConsoleHelper.printTitle("Menu de inicio");
        ConsoleHelper.printOption(1, "Profesorado");
        ConsoleHelper.printOption(2, "Estudiantes");
        int opcion = ConsoleHelper.readInt("Selecciona tu identidad");

        switch (opcion){
            case 1 -> funcionesProfesor();
            case 2 -> funcionesEstudiante();
            default -> ConsoleHelper.printTitle("Opcion invalida");
        }
    }

    //Rama de metodos para todas las funciones que realiza un estudiante
    private static void funcionesEstudiante(){
        loggeoEstudiante();
        menuEstudiante();
    }
    private static void loggeoEstudiante(){
        ConsoleHelper.printTitle("Introduce tus datos");
        String nombre = ConsoleHelper.readLine("Nombre");
        String apellidos = ConsoleHelper.readLine("Apellidos");
        int edad = ConsoleHelper.readInt("Edad");
        Estudiante e = new Estudiante(nombre, apellidos, edad);
        e.saludar();
        e.estudiar();
    }

    private static void menuEstudiante(){
        do {
            ConsoleHelper.printTitle("Menu de herramientas");
            ConsoleHelper.printOption (1, "Calculadora");
            ConsoleHelper.printOption(2, "Tablas de multiplicar");
            ConsoleHelper.printOption(0, "Salir");
            int opcion = ConsoleHelper.readInt("Introduce una opcion");

            if (opcion == 0){
                break;
            }

            switch (opcion){
                case 1 -> CalculatorController.showMenu();
                case 2 -> MultiplicationTableController.showMenu();
                default -> ConsoleHelper.printTitle("Opcion invalida");
            }

        }while (true);
    }

    //Rama de metodos para todas las funciones que realiza un profesor
    private static void funcionesProfesor(){
        loggeoProfesor();
    }
    private static void loggeoProfesor(){
        ConsoleHelper.printTitle("Introduce tus datos");
        String nombre = ConsoleHelper.readLine("Nombre");
        String apellidos = ConsoleHelper.readLine("Apellidos");
        int edad = 0;
        String asignatura = ConsoleHelper.readLine("Asignatura impartida");
        Profesor pf = new Profesor(nombre, apellidos, edad, asignatura);
        pf.saludar();
        pf.enseñar();
    }
}
