package com.scabrera.studentHelper.model;

public class Profesor extends Persona{
    private String asignatura;
    public Profesor(String nombre, String apellidos, int edad, String asignatura) {
        super(nombre, apellidos, edad);
        this.asignatura = asignatura;
    }

    @Override
    public void saludar(){
        System.out.println("Hola me llamo " + getNombre() + " " + getApellidos() + " y soy tu profesor de " + asignatura);
    }
    public void enseñar(){
        System.out.println("Estoy enseñando");
    }
}
