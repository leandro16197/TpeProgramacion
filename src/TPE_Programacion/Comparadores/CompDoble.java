package TPE_Programacion.Comparadores;

import TPE_Programacion.ElementoParticipante;

public class CompDoble extends Comparador{
    private Comparador comp1,comp2;

    public CompDoble(Comparador comp1, Comparador comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(ElementoParticipante o1, ElementoParticipante o2) {
        int resultado= comp1.compare(o1,o2);;
        if(resultado==0){
            return comp2.compare(o1,o2);
        }
        return resultado;
    }
}
