package TPE_Programacion.Comparadores;

import TPE_Programacion.ElementoParticipante;

import java.util.Comparator;

public class CompCompuesto extends Comparador{
    private Comparator<ElementoParticipante> comp1;
    private Comparator<ElementoParticipante> comp2;


    public CompCompuesto(Comparator<ElementoParticipante> comp1, Comparator<ElementoParticipante> comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(ElementoParticipante o1, ElementoParticipante o2) {
        int aux = comp1.compare(o1,o2);

        if(aux == 0 && comp2!=null){
            return comp2.compare(o1, o2);
        }


        return aux;
    }
}
