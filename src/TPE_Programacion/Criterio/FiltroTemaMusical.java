package TPE_Programacion.Criterio;

import TPE_Programacion.ElementoParticipante;
import TPE_Programacion.TemaMusical;

public class FiltroTemaMusical implements Filtro{
    TemaMusical t;

    public FiltroTemaMusical(TemaMusical t) {
        this.t = t;
    }

    @Override
    public boolean criterio(ElementoParticipante p) {
        return p.TemaMuscial(t);
    }
}
