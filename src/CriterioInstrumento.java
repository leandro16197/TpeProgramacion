public class CriterioInstrumento implements Criterio {
    private String instrumento;

    public CriterioInstrumento(String instrumento) {
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
        for(int i=0;i<p.getInstrumentos().size();i++){
            if(p.getInstrumentos().get(i)==this.getInstrumento()){
                return true;
            }
        }
        return false;
    }
}
