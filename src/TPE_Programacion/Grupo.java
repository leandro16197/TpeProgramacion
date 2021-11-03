package TPE_Programacion;


import TPE_Programacion.Comparadores.Comparador;
import TPE_Programacion.Criterio.Filtro;
import TPE_Programacion.Ordenamiento.OrdenamientoGenero;

import java.util.ArrayList;
import java.util.Collections;

public class Grupo extends ElementoParticipante {
    private ArrayList<ElementoParticipante>grupo;

    public Grupo(String nombre, ArrayList<ElementoParticipante> grupo) {
        super(nombre);
        this.grupo = new ArrayList<>();
    }

    @Override
    public int getEdad() {

        int total=0,cantIntegrantes=0;

        for(ElementoParticipante g:grupo){
            total+=g.getEdad();
            cantIntegrantes+=g.getCantidadGrupo();
        }
        return total/cantIntegrantes;
    }
    //preguntar
    @Override
    public ArrayList getPreferenciaMusical() {
        ArrayList aux =new ArrayList<>();
        for (int i=0; i < grupo.size(); i++ ){
            for(int j=0; j < grupo.get(i).getPreferenciaMusical().size();j++){
                if(grupo.get(i).getPreferenciaMusical().get(j).equals(grupo.get(i+1).getPreferenciaMusical().get(j))) {
                    aux.add(grupo.get(i).getPreferenciaMusical().get(j));
                }
            }
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
    public int cantInstrumento() {
        int total=0;
        for(ElementoParticipante e:grupo){
            total+= e.cantInstrumento();
        }
        return total;
    }

    @Override
    public int cantGenero() {
        int total=0;
        for(ElementoParticipante e:grupo){
            total+= e.cantGenero();
        }
        return total;
    }
    public int cantIdioma() {
        int total=0;
        for(ElementoParticipante e:grupo){
            total+= e.cantIdioma();
        }
        return total;
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


