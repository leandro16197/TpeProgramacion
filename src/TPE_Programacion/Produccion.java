package TPE_Programacion;

import java.util.ArrayList;

public class Produccion {
    private ArrayList<Coach>coach;
    private ArrayList<TemaMusical>temas;

    public boolean addParticipante(ElementoParticipante p){
        boolean agregado=false;
        int i=0;
        while(i<this.coach.size() && agregado) {
            if(this.coach.get(i).addParticipante(p)){
                agregado=true;
                return agregado;
            }
            i++;

        }
        return agregado;
    }

    public ArrayList<TemaMusical> getTemas(){
        return new ArrayList<>(this.temas);
    }

    public ArrayList<Coach>getCoach(){
        return new ArrayList<>(this.coach);
    }

}
