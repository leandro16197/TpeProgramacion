public class CriterioIDual implements Criterio {
    private Criterio comp1;
    private Criterio comp2;

    public CriterioIDual(Criterio comp1, Criterio comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    public Criterio getComp1() {
        return comp1;
    }

    public void setComp1(Criterio comp1) {
        this.comp1 = comp1;
    }

    public Criterio getComp2() {
        return comp2;
    }

    public void setComp2(Criterio comp2) {
        this.comp2 = comp2;
    }

    @Override
    public boolean criterio(Participante p) {
        return this.getComp1().criterio(p) && this.getComp2().criterio(p);
    }
}
