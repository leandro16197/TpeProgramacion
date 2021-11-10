package TPE_Programacion;

import java.util.ArrayList;
import java.util.Comparator;

public class Reality {
    private String nombre;
    private Comparator<ElementoParticipante> comp;
    private ArrayList<Coach>entrenadores;

    public Reality(String nombre,Comparator<ElementoParticipante>comp) {
        this.nombre = nombre;
        this.entrenadores=new ArrayList<>();
        this.comp=comp;
    }

    public void addCoach(Coach c){
        this.entrenadores.add(c);
    }

    public void setComp(Comparator<ElementoParticipante> comp) {
        this.comp = comp;
    }


    public Comparator<ElementoParticipante> getComp() {
        return comp;
    }

    public int batalla(ElementoParticipante e1, ElementoParticipante e2) {

        if(this.getComp().compare(e1,e2)<0){
            return -1;
        }else{
            if(this.getComp().compare(e1,e2)>0){
                return 1;
            }
        }
        return 0;
    }

}
