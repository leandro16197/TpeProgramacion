package TPE_Programacion.Criterio;

import TPE_Programacion.Participante;

public class FiltroEdad implements Filtro {
    private int edad;

    public FiltroEdad(int edad) {
        edad = edad;
    }

    @Override
    public boolean criterio(Participante p) {
        return p.getEdad()>this.edad;
    }
}
 