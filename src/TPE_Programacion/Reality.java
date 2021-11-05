package TPE_Programacion;

import java.util.ArrayList;
import java.util.Comparator;

public class Reality {
    private String nombre;
    private ArrayList<Coach>entrenadores;

    public Reality(String nombre) {
        this.nombre = nombre;
        this.entrenadores=new ArrayList<>();
    }

    public void addCoach(Coach c){
        this.entrenadores.add(c);
    }

    public int batalla(ElementoParticipante e1, ElementoParticipante e2, Comparator<ElementoParticipante> comp) {
        if(comp.compare(e1,e2)<0){
            return -1;
        }else{
            if(comp.compare(e1,e2)>0){
                return 1;
            }
        }
        return 0;
    }
}
