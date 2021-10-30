package TPE_Programacion.Criterio;

import TPE_Programacion.Participante;

public class FiltroIDual implements Filtro {
    private Filtro comp1;
    private Filtro comp2;

    public FiltroIDual(Filtro comp1, Filtro comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    public Filtro getComp1() {
        return comp1;
    }

    public void setComp1(Filtro comp1) {
        this.comp1 = comp1;
    }

    public Filtro getComp2() {
        return comp2;
    }

    public void setComp2(Filtro comp2) {
        this.comp2 = comp2;
    }

    @Override
    public boolean criterio(Participante p) {
        return this.getComp1().criterio(p) && this.getComp2().criterio(p);
    }
}
