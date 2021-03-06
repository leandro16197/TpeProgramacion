package TPE_Programacion.Criterio;

import TPE_Programacion.ElementoParticipante;
import TPE_Programacion.Participante;

public class FiltroIdioma implements Filtro {
    private String idioma;

    public FiltroIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean criterio(ElementoParticipante p) {
    	return p.cumpleIdioma(idioma);
    }
    	
}
