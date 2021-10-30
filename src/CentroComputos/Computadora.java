package CentroComputos;

public class Computadora {
    private double velocidadCPU;
    private String nombre;

    public Computadora(String nombre,double velocidadCPU) {
        this.velocidadCPU = velocidadCPU;
        this.nombre = nombre;
    }

    public double getVelocidadCPU() {
        return velocidadCPU;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "velocidadCPU=" + velocidadCPU +
                ", nombre='" + nombre + '\'' +
                '}'+"\n";
    }
}
