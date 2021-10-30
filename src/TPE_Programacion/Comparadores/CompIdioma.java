package TPE_Programacion.Comparadores;

import TPE_Programacion.ElementoParticipante;

public class CompIdioma extends Comparador{
    @Override
    public int compare(ElementoParticipante o1, ElementoParticipante o2) {
        return o1.cantIdioma() - o2.cantIdioma();
    }
}
