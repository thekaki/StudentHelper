package com.scabrera.studentHelper.model;

import com.scabrera.studentHelper.util.ConsoleHelper;

public class Estudiante extends Persona{
    public Estudiante(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
    }

    public void estudiar(){
        ConsoleHelper.printTitle("Estoy estudiando");
    }
}
