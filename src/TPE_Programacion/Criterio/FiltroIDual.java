package TPE_Programacion.Criterio;

import TPE_Programacion.ElementoParticipante;
import TPE_Programacion.Participante;

public class FiltroIDual implements Filtro {
    private Filtro comp1;
    private Filtro comp2;

    public FiltroIDual(Filtro comp1, Filtro comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    public boolean criterio(ElementoParticipante p) {
        return this.comp1.criterio(p) && this.comp2.criterio(p);
    }
}
