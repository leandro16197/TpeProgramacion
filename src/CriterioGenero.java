public class CriterioGenero implements Criterio {
    private String genero;

    public CriterioGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean criterio(Participante p) {
        //ver de hacer el contains
        for(int i=0;i<p.getGenero().size();i++){
            if(p.getGenero().get(i)==this.getGenero()){
                return true;
            }
        }
        return false;
    }
}
