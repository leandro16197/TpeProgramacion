public class CriterioIdioma implements Criterio {
    private String idioma;

    public CriterioIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public boolean criterio(Participante p) {
        for(int i=0;i<p.getIdioma().size();i++){
            if(p.getIdioma().get(i)==this.getIdioma()){
                return true;
            }
        }
        return false;
    }
}
