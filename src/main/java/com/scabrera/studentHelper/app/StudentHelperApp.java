package com.scabrera.studentHelper.app;

import com.scabrera.studentHelper.model.Estudiante;
import com.scabrera.studentHelper.model.Profesor;
import com.scabrera.studentHelper.service.CalculatorService;
import com.scabrera.studentHelper.util.InputHelper;

public class StudentHelperApp {
    public static void run() {
        menuIdentidad();
        InputHelper.closeScanner();
    }

    private static void menuIdentidad(){
        System.out.println("Menu de inicio");
        System.out.println("1 - Profesorado");
        System.out.println("2 - Estudiantes");
        System.out.println("Selecciona tu identidad:");
        int opcion = InputHelper.readInt();
        InputHelper.readLine();
        switch (opcion){
            case 1 -> funcionesProfesor();
            case 2 -> funcionesEstudiante();
            default -> System.out.println("Opcion invalida");
        }
    }

    //Rama de metodos para todas las funciones que realiza un estudiante
    private static void funcionesEstudiante(){
        loggeoEstudiante();
        menuEstudiante();
    }
    private static void loggeoEstudiante(){
        System.out.println("Introduce tus datos");
        System.out.println("Nombre: ");
        String nombre = InputHelper.readLine();
        System.out.println("Apellidos: ");
        String apellidos = InputHelper.readLine();
        System.out.println("Edad: ");
        int edad = InputHelper.readInt();
        Estudiante e = new Estudiante(nombre, apellidos, edad);
        e.saludar();
        e.estudiar();
    }

    private static void menuEstudiante(){
        do {
            System.out.println("A que herramientas quieres acceder");
            System.out.println("1 - Calculadora");
            System.out.println("2 - Tablas de multiplicar");
            System.out.println("0 - Salir");
            int opcion = InputHelper.readInt();

            if (opcion == 0){
                break;
            }

            switch (opcion){
                case 1 -> CalculatorService.calculadora();
                case 2 -> System.out.println("Menu tablas");
                default -> System.out.println("Opcion invalida");
            }

        }while (true);
    }

    //Rama de metodos para todas las funciones que realiza un profesor
    private static void funcionesProfesor(){
        loggeoProfesor();
    }
    private static void loggeoProfesor(){
        System.out.println("Introduce tus datos");
        System.out.println("Nombre");
        String nombre = InputHelper.readLine();
        System.out.println("Apellidos");
        String apellidos = InputHelper.readLine();
        int edad = 0;
        System.out.println("Asignatura impartida");
        String asignatura = InputHelper.readLine();
        Profesor pf = new Profesor(nombre, apellidos, edad, asignatura);
        pf.saludar();
        pf.enseñar();
    }
}
