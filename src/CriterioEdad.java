public class CriterioEdad implements Criterio{
    private int Edad;

    public CriterioEdad(int edad) {
        Edad = edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public boolean criterio(Participante p) {
        return p.getEdad()>this.getEdad();
    }
}
