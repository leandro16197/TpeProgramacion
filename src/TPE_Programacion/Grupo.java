package TPE_Programacion;


import TPE_Programacion.Criterio.Filtro;
import TPE_Programacion.Ordenamiento.OrdenamientoGenero;

import java.util.ArrayList;
import java.util.Collections;

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
    //preguntar
    @Override
    public ArrayList getPreferenciaMusical() {
        ArrayList<String> aux =new ArrayList<>();
        for(ElementoParticipante e:grupo){
            aux.addAll(e.getPreferenciaMusical());
        }
        return aux;
    }
    public ArrayList<String> getIdiomas(){
        ArrayList<String> aux =new ArrayList<>();
        for(ElementoParticipante e:grupo){
            if(!aux.contains(e.getIdiomas())){
                aux.addAll(e.getIdiomas());
            }
        }
        return aux;
    }
    public  int getCantidadGrupo(){
        int total=0;
        for(ElementoParticipante e:grupo){
            total+=e.getCantidadGrupo();
        }
        return total;
    }
    @Override
    public ArrayList<String> getInstrumento() {
        ArrayList<String> aux =new ArrayList<>();
        for(ElementoParticipante e:grupo){
            if(!aux.contains(e.getInstrumento())){
                aux.addAll(e.getInstrumento());
            }
        }
        return aux;

    }

    @Override
    public ArrayList getListaInstrumentos() {
        ArrayList<String> aux =new ArrayList<>();
        for(ElementoParticipante e:grupo){
            if(!aux.contains(e.getListaInstrumentos())){
                aux.addAll(e.getListaInstrumentos());
            }
        }
        return aux;
    }

    @Override
    public ArrayList getCantantes(Filtro f) {
        ArrayList aux =new ArrayList<>();
        for (ElementoParticipante e:grupo){
            aux.addAll(e.getCantantes(f));
        }
        return aux;
    }
    @Override
    public ArrayList getListaGenero() {
        ArrayList<String> aux=new ArrayList();
        for(ElementoParticipante e:grupo){
            aux.addAll(e.getListaGenero());
        }
        Collections.sort(aux);
        return aux;
    }
}


