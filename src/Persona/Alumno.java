package Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends  Persona{

    private int legajo;
    private ArrayList<String> materiasAprobadas;


    public Alumno(String nombre, LocalDate nacimiento, int legajo) {
        super(nombre, nacimiento);
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public int getLegajo(){
        return legajo;
    }

    public int cantMateriasAprobadas(){
        return this.materiasAprobadas.size();
    }

    public void agregarMateriasAprobadas(String materia){
        materiasAprobadas.add(materia);
    }
}
