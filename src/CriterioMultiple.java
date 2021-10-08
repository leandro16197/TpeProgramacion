public class CriterioMultiple implements Criterio{
    private Criterio criterio1;//criterio dual ingles y espanol
    private Criterio criterio2;//instrumento
    private Criterio criterio3;//genero

    public CriterioMultiple(Criterio criterio1, Criterio criterio2, Criterio criterio3) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
        this.criterio3 = criterio3;
    }

    public Criterio getCriterio1() {
        return criterio1;
    }

    public void setCriterio1(Criterio criterio1) {
        this.criterio1 = criterio1;
    }

    public Criterio getCriterio2() {
        return criterio2;
    }

    public void setCriterio2(Criterio criterio2) {
        this.criterio2 = criterio2;
    }

    public Criterio getCriterio3() {
        return criterio3;
    }

    public void setCriterio3(Criterio criterio3) {
        this.criterio3 = criterio3;
    }

    @Override
    public boolean criterio(Participante p) {
        return (this.criterio1.criterio(p) && this.criterio2.criterio(p)) || this.criterio3.criterio(p);
    }
}
