package Persona;

import java.time.LocalDate;

public class Empleado extends Persona{

    private double sueldoBasico;

    public Empleado(String nombre, LocalDate nacimiento, double sueldoBasico) {
        super(nombre, nacimiento);
        this.sueldoBasico = sueldoBasico;
    }

    private double calcularBonificaciones(){
        return 0.0;
    }
    private double calcularRetenciones(){
        return 0.0;
    }

    public double getSueldoBasico(){
        return sueldoBasico + calcularBonificaciones() + calcularRetenciones();
    }

}
