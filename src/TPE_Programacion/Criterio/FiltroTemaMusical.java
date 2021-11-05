package TPE_Programacion.Criterio;

import TPE_Programacion.ElementoParticipante;
import TPE_Programacion.TemaMusical;

public class FiltroTemaMusical implements Filtro{
    private TemaMusical t;

    public FiltroTemaMusical(TemaMusical t) {
        this.t = t;
    }

    @Override
    public boolean criterio(ElementoParticipante p) {
        return  p.cumpleInstrumento(t.getInstrumentos()) && p.preferencia(t.getGenero()) && p.cumpleIdioma(t.getIdioma());
    }
}
