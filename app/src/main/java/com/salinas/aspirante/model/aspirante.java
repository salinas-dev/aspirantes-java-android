package com.salinas.aspirante.model;

public class aspirante {
    //Se definen tres variables miembro privadas:
    // "nombre" (tipo String),
    // "promedio" (tipo double)
    // "tipoBachillerato" (tipo String).
    private String nombre;
    private double promedio;
    private String tipoBachillerato;

    //Se define un constructor público con tres parámetros:
    // "nombre" (tipo String),
    // "promedio" (tipo double)
    // "tipoBachillerato" (tipo String).



    public aspirante(String nombre, double promedio, String tipoBachillerato) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.tipoBachillerato = tipoBachillerato;
    }

    //Se define un método público llamado
    //"Aceptado" que devuelve un valor booleano.
    //Si el promedio es mayor o igual a 90, se cumple esta condición.
    //El método devuelve verdadero (true).
    //Si el promedio es mayor o igual a 80, pero menor que 90 y el tipo de bachillerato es
    //"Fisico Matematico", se cumple esta condición.
    //El método devuelve verdadero (true).
    // //El método devuelve falso (false).

    public boolean Aceptado() {
        if (promedio >= 90) {
            return true;
        } else if (promedio >= 80 && promedio < 90 && tipoBachillerato.equals("Fisico Matematico")) {
            return true;
        } else {
            return false;
        }
    }
}
