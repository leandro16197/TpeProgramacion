package TPE_Programacion.Criterio;

import TPE_Programacion.Participante;

public class FiltroEdad implements Filtro {
    private int Edad;

    public FiltroEdad(int edad) {
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
 