package TPE_Programacion.Criterio;

import TPE_Programacion.ElementoParticipante;

public class FiltroOr implements Filtro{

    private Filtro f1,f2;

    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean criterio(ElementoParticipante p) {
        return f1.criterio(p) || f2.criterio(p);
    }
}
