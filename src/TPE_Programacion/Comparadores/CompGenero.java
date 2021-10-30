package TPE_Programacion.Comparadores;

import TPE_Programacion.ElementoParticipante;

public class CompGenero extends Comparador{
    @Override
    public int compare(ElementoParticipante o1, ElementoParticipante o2) {
        return o1.cantGenero() - o2.cantGenero();
    }


}
