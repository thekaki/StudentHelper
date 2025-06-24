package com.scabrera.studentHelper.model;

public class Estudiante extends Persona{
    public Estudiante(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
    }

    public void estudiar(){
        System.out.println("Estoy estudiando");
    }
}
