package TPE_Programacion;

import TPE_Programacion.Comparadores.CompEdad;
import TPE_Programacion.Comparadores.Comparador;
import TPE_Programacion.Criterio.Filtro;


import java.util.ArrayList;
import java.util.Collections;


public class Coach {
    private String nombre;
    private Comparador comparador;
    private ArrayList<ElementoParticipante>grupo;

    public Coach(String nombre) {
        this.nombre = nombre;
        this.comparador=new CompEdad();
        this.grupo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addParticipante(ElementoParticipante e){
        this.grupo.add(e);
    }
    public ArrayList getParticipantes(){
        return new ArrayList(this.grupo);
    }

    public ArrayList<ElementoParticipante> getCantantes(Filtro f){
        ArrayList<ElementoParticipante>listaAux = new ArrayList();
        for(ElementoParticipante e:grupo){
            listaAux.addAll(e.getCantantes(f));
        }
        return listaAux;
    }


    public ArrayList<String> getListaGenero(){
        ArrayList<String> aux=new ArrayList();
        for(ElementoParticipante e:grupo){
            aux.addAll(e.getListaGenero());
        }
        Collections.sort(aux);
        return aux;
    }


    public ArrayList<String> getListaInstrumentos() {
        ArrayList<String> listaAux = new ArrayList();
        for(ElementoParticipante e: grupo){
            if(!listaAux.contains(e.getListaInstrumentos())){
                listaAux.addAll(e.getListaInstrumentos());
            }
        }
        return listaAux;
    }

    public ArrayList<String> getListaIdiomas(){
        ArrayList<String> listaAux = new ArrayList();
        for(ElementoParticipante e:grupo){
            if(!listaAux.contains(e.getIdiomas())){
                listaAux.addAll(e.getIdiomas());
            }
        }
        return listaAux;
    }
    public ArrayList<ElementoParticipante> getListaParticipantesOrdenada(Comparador c){
        ArrayList<ElementoParticipante> aux=new ArrayList(this.grupo);
        Collections.sort(aux,c);
        return aux;
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
