package TPE_Programacion;

import TPE_Programacion.Criterio.Filtro;

import java.util.ArrayList;

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

    
    //agrega items de tipo String a cada una de las listas

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

    //retorna lista de generos musicales
    @Override
    public ArrayList<String>  getPreferenciaMusical() {
        return new ArrayList(this.generosMusicales);
    }
    //retorna lista de idiomas
    @Override
    public ArrayList<String> getIdiomas() {
        return new ArrayList(this.idiomas);
    }

    @Override
    public int getCantidadGrupo() {
        return 1;
    }

    @Override
    public ArrayList<ElementoParticipante> getCantantes(Filtro f) {
        ArrayList<ElementoParticipante> aux =new ArrayList<>();
        if(f.criterio(this)){
            aux.add(this);
        }
        return aux;
    }

    @Override
    public ArrayList<String> getListaInstrumentos() {
        return new ArrayList(this.instrumentos);
    }

    @Override
    public ArrayList<String>getListaGenero() {
        return this.getPreferenciaMusical();
    }

    //para los criterios
    public boolean cumpleInstrumento(String instrumento){
        return this.getListaInstrumentos().contains(instrumento);
    }
    
    public boolean cumpleGenero(String genero){
        return this.getListaGenero().contains(genero);
    }
    public boolean cumpleIdioma(String idioma){
        return this.getIdiomas().contains(idioma);
    }

    //retornan la cantidad de instrumentos
    @Override
    public int cantInstrumento() {
        return this.instrumentos.size();
    }
    //retornan la cantidad de generos
    @Override
    public int cantGenero() {
        return this.generosMusicales.size();
    }
    //retornan la cantidad de idiomas
    @Override
    public int cantIdioma() {
        return this.idiomas.size();
    }

    //retorna la edad
    @Override
    public int getEdad() {
        return this.edad;
    }
    //datos participante
    @Override
    public String toString() {
        return "Nombre : "+this.getNombre()+" Apellido : "+this.getApellido()+" Edad : "+this.getEdad();
    }

    //filtro tema musical


    @Override
    public boolean preferencia(ArrayList genero) {
        for (int i = 0;i<genero.size();i++){
            if(this.getListaGenero().contains(genero.get(i))){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cumpleInstrumento(ArrayList instrumentos) {
        for (int i = 0;i<instrumentos.size();i++){
            if(this.getListaInstrumentos().contains(instrumentos.get(i))){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean TemaMuscial(TemaMusical t) {
        if(this.cumpleIdioma(t.getIdioma())){
            for(int i=0;i<t.getGenero().size();i++){
                if(this.cumpleGenero(t.getGenero().get(i))){
                        return true;
                }
            }
        }
        return false;
    }

}
