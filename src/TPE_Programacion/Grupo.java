package TPE_Programacion;


import TPE_Programacion.Comparadores.Comparador;
import TPE_Programacion.Criterio.Filtro;

import java.util.ArrayList;
import java.util.Collections;

public class Grupo extends ElementoParticipante {
    private ArrayList<ElementoParticipante>grupo;

    public Grupo(String nombre, ArrayList<ElementoParticipante> grupo) {
        super(nombre);
        this.grupo = new ArrayList<>();
    }

    //retorna el promedio de edad de todos los participantes
    @Override
    public int getEdad() {

        int total=0,cantIntegrantes=0;

        for(ElementoParticipante g:grupo){
            total+=g.getEdad();
            cantIntegrantes+=g.getCantidadGrupo();
        }
        return total/cantIntegrantes;
    }

    //retorna una lista de generos musicales que hagan intersección en los generos de preferencia de todos
    @Override
    public ArrayList<String>  getPreferenciaMusical() {
        ArrayList<String>  aux =new ArrayList<>();
        for (int i=0; i < grupo.size(); i++ ){
            for(int j=0; j < grupo.get(i).getPreferenciaMusical().size();j++){
                if(grupo.get(i).getPreferenciaMusical().get(j).equals(grupo.get(i+1).getPreferenciaMusical().get(j))) {
                    aux.add(grupo.get(i).getPreferenciaMusical().get(j));
                }
            }
        }
        return aux;
    }

    //retorna una lista de idiomas no repetidos
    @Override
    public ArrayList<String> getIdiomas(){
        ArrayList<String> aux =new ArrayList<>();
        for(ElementoParticipante e:grupo){
            if(!aux.contains(e.getIdiomas())){
                aux.addAll(e.getIdiomas());
            }
        }
        return aux;
    }
    //retorna la catidad de participantes
    @Override
    public  int getCantidadGrupo(){
        int total=0;
        for(ElementoParticipante e:grupo){
            total+=e.getCantidadGrupo();
        }
        return total;
    }

    //retorna la cantidad de insturmnentos total
    @Override
    public int cantInstrumento() {
        int total=0;
        for(ElementoParticipante e:grupo){
            total+= e.cantInstrumento();
        }
        return total;
    }
    //retorna la cantidad de generos total
    @Override
    public int cantGenero() {
        int total=0;
        for(ElementoParticipante e:grupo){
            total+= e.cantGenero();
        }
        return total;
    }
    //retorna la cantidad de idiomas total
    @Override
    public int cantIdioma() {
        int total=0;
        for(ElementoParticipante e:grupo){
            total+= e.cantIdioma();
        }
        return total;
    }

    //retorna una lista de instrumentos no repetidos
    @Override
    public ArrayList<String> getListaInstrumentos() {
        ArrayList<String> aux =new ArrayList<>();
        for(ElementoParticipante e:grupo){
            if(!aux.contains(e.getListaInstrumentos())){
                aux.addAll(e.getListaInstrumentos());
            }
        }
        return aux;
    }
    //retorna lista de cantantes segun un criterio
    @Override
    public ArrayList<ElementoParticipante> getCantantes(Filtro f) {
        ArrayList<ElementoParticipante> aux =new ArrayList<>();
        for (ElementoParticipante e:grupo){
            aux.addAll(e.getCantantes(f));
        }
        return aux;
    }
    //retorna una lista de generos no repetidas
    @Override
    public ArrayList<String> getListaGenero() {
        ArrayList<String> aux=new ArrayList();
        for(ElementoParticipante e:grupo){
            aux.addAll(e.getListaGenero());
        }
        Collections.sort(aux);
        return aux;
    }
    //criterios

    @Override
    public boolean cumpleInstrumento(String instrumento) {
        for(ElementoParticipante e : grupo){
            if(e.cumpleInstrumento(instrumento)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cumpleIdioma(String idioma) {
        for (ElementoParticipante e:grupo){
            if(e.cumpleIdioma(idioma)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cumpleGenero(String genero) {
        for (ElementoParticipante e:grupo){
            if(e.cumpleGenero(genero)){
                return true;
            }
        }

        return false;
    }
    //filtro

    @Override
    public boolean preferencia(ArrayList genero) {
        for(ElementoParticipante e:grupo){
            if(e.preferencia(genero)){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean cumpleInstrumento(ArrayList instrumentos) {
        for(ElementoParticipante e:grupo){
            if(e.cumpleInstrumento(instrumentos)){
                return true;
            }
        }
        return false;
    }
}


