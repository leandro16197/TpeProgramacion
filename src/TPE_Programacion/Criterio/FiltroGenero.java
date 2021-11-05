package TPE_Programacion.Criterio;

import TPE_Programacion.ElementoParticipante;


public class FiltroGenero implements Filtro {
    private String genero;

    public FiltroGenero(String genero) {
        this.genero = genero;
    }

    public boolean criterio(ElementoParticipante p) {
    	return p.cumpleGenero(genero);
    }
    	
    	
}
