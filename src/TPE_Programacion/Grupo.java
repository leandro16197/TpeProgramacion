package TPE_Programacion;

import java.util.ArrayList;

public class Grupo extends ElementoParticipante {
    private ArrayList<ElementoParticipante>grupo;

    public Grupo(String nombre, ArrayList<ElementoParticipante> grupo) {
        super(nombre);
        this.grupo = grupo;
    }

    @Override
    public int getEdad() {
        int total=0;
        for(ElementoParticipante g:grupo){
            total+=g.getEdad();
        }
        return total;
    }

    @Override
    public ArrayList getPreferenciaMusical() {
        ArrayList<String> aux =new ArrayList<>();
        
        return null;
    }
}


