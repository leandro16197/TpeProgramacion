package Persona;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre;
    private LocalDate nacimiento;

    public Persona(String nombre, LocalDate nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre(){
        return nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public int getEdad(){
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(nacimiento,ahora);
        return periodo.getYears();
    }

}
