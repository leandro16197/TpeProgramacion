package CentroComputos;

public class Proceso {

    private double memoriaRequerida;
    private String nombre;

    public Proceso(double memoriaRequerida, String nombre) {
        this.memoriaRequerida = memoriaRequerida;
        this.nombre = nombre;
    }

    public double getMemoriaRequerida() {
        return memoriaRequerida;
    }

    public String getNombre() {
        return nombre;
    }
}
