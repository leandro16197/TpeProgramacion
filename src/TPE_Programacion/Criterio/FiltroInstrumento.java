package TPE_Programacion.Criterio;

import TPE_Programacion.Participante;

public class FiltroInstrumento implements Filtro {
    private String instrumento;

    public FiltroInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public boolean criterio(Participante p) {
     return p.cumpleInstrumento(instrumento);
    }
}
