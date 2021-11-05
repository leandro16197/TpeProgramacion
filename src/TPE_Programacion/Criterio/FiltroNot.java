package TPE_Programacion.Criterio;

import TPE_Programacion.ElementoParticipante;

public class FiltroNot implements Filtro{

    private Filtro f1;


    public FiltroNot(Filtro f1) {
        this.f1 = f1;
    }

    @Override
    public boolean criterio(ElementoParticipante p) {
        return !f1.criterio(p);
    }
}
