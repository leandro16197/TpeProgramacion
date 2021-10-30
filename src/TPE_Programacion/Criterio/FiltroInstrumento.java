package TPE_Programacion.Criterio;

import TPE_Programacion.Participante;

public class FiltroInstrumento implements Filtro {
    private String instrumento;

    public FiltroInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public boolean criterio(Participante p) {
            if(p.cumple(instrumento)){
                return true;
            }
        return false;
    }
}
