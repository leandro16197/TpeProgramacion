package TPE_Programacion.Criterio;

import TPE_Programacion.Participante;

public class FiltroGenero implements Filtro {
    private String genero;

    public FiltroGenero(String genero) {
        this.genero = genero;
    }

    public boolean criterio(Participante p) {
    	return p.cumpleGenero(genero);
    }
    	
    	
}
