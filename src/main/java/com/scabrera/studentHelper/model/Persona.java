package com.scabrera.studentHelper.model;

public class Persona {
    private final String nombre;
    private final String apellidos;
    private final int edad;

    public Persona (String nombre, String apellidos, int edad) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola me llamo " + nombre + " " + apellidos + " y tengo " + edad + " años.");
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
}
