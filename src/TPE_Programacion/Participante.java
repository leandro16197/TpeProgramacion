package TPE_Programacion;

import TPE_Programacion.Criterio.Filtro;
import TPE_Programacion.Ordenamiento.OrdenamientoGenero;

import java.util.ArrayList;
import java.util.Collections;

public class Participante extends ElementoParticipante{
    private String apellido;
    private int edad;
    private ArrayList<String>generosMusicales;
    private ArrayList<String>idiomas;
    private ArrayList<String>instrumentos;

    public Participante( String nombre,String apellido, int edad) {
        super(nombre);
        this.apellido = apellido;
        this.edad = edad;
        this.generosMusicales=new ArrayList<>();
        this.idiomas=new ArrayList<>();
        this.instrumentos=new ArrayList<>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    public void addGenero(String genero){
        this.generosMusicales.add(genero);
    }
    public void addIdioma(String idioma){
        this.idiomas.add(idioma);
    }

    public void addInstrumento(String instrumento){
        if(!this.instrumentos.contains(instrumento)){
            this.instrumentos.add(instrumento);
        }
    }
    public ArrayList getGenero(){
        return new ArrayList(this.generosMusicales);
    }
    public ArrayList getIdioma(){
        return new ArrayList(this.idiomas);
    }
    public ArrayList getInstrumentos(){
        return new ArrayList(this.instrumentos);
    }

    @Override
    public ArrayList getPreferenciaMusical() {
        return this.getGenero();
    }

    @Override
    public int getEdad() {
        return this.edad;
    }
    @Override
    public String toString() {
        return "Nombre :"+this.getNombre()+" Apellido : "+this.getNombre()+" Edad : "+this.getEdad();
    }

    @Override
    public ArrayList<String> getIdiomas() {
        ArrayList<String> aux=new ArrayList();
        aux.addAll(this.getIdioma());
        return null;
    }

    @Override
    public ArrayList<String> getInstrumento() {
        ArrayList<String >aux=new ArrayList<>();
        aux.addAll(this.getInstrumentos());
        return aux;
    }

    @Override
    public int cantInstrumento() {
        return this.instrumentos.size();
    }
    public int cantGenero() {
        return this.generosMusicales.size();
    }
    public int cantIdioma() {
        return this.idiomas.size();
    }
    @Override
    public int getCantidadGrupo() {
        return 1;
    }

    @Override
    public ArrayList getCantantes(Filtro f) {
        ArrayList aux =new ArrayList<>();
        if(f.criterio(this)){
            aux.add(this);
        }
        return aux;
    }

    @Override
    public ArrayList getListaInstrumentos() {
        ArrayList aux =new ArrayList<>();
        aux.addAll(this.getInstrumentos());
        return aux;
    }

    @Override
    public ArrayList getListaGenero() {
        ArrayList aux=new ArrayList();
        aux.addAll(this.getGenero());
        return aux;
    }
    public boolean cumpleInstrumento(String instrumento){
        return this.getInstrumento().contains(instrumento);
    }
    
    public boolean cumpleGenero(String genero){
        return this.getGenero().contains(genero);
    }
    public boolean cumpleIdioma(String genero){
        return this.getIdiomas().contains(genero);
    }
    
}
