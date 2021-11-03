package TPE_Programacion;

import TPE_Programacion.Criterio.Filtro;
import TPE_Programacion.Ordenamiento.OrdenamientoGenero;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Coach {
    private String nombre;
    private ArrayList<ElementoParticipante>grupo;
    //preguntar si nesesita atributo para saber si es jurado o

    public Coach(String nombre) {
        this.nombre = nombre;
        this.grupo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int batalla(ElementoParticipante e1, ElementoParticipante e2, Comparator<ElementoParticipante> comp) {
    	return comp.compare(e1,e2);
    }
    
    public void addParticipante(ElementoParticipante e){
        this.grupo.add(e);
    }
    public ArrayList getParticipantes(){
        return new ArrayList(this.grupo);
    }

    public ArrayList getCantantes(Filtro f){
        ArrayList<ElementoParticipante>listaAux = new ArrayList();
        for(ElementoParticipante e:grupo){
            listaAux.addAll(e.getCantantes(f));
        }
        return listaAux;
    }
    public ArrayList getListaGenero(OrdenamientoGenero o){

        return null;
    }
    public ArrayList getListaInstrumentos() {
        ArrayList listaAux = new ArrayList();
        for(ElementoParticipante e: grupo){
            listaAux.addAll(e.getListaInstrumentos());
        }
        return listaAux;
    }

    public ArrayList getListaIdiomas(){
        ArrayList listaAux = new ArrayList();
        for(ElementoParticipante e:grupo){
            if(!listaAux.contains(e.getIdiomas())){
                listaAux.addAll(e.getIdiomas());
            }
        }
        return listaAux;
    }

    public double promedioEdad(){
        double promedio=0.0;
        int cantParticipantes=0;
        for(ElementoParticipante e:grupo){
            promedio+=e.getEdad();
            cantParticipantes+=e.getCantidadGrupo();
        }
        return promedio/cantParticipantes;
    }

    public String toString () {
            return "Coach Nombre : " + this.getNombre();
        }
}
