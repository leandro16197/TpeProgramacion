package TPE_Programacion;

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
        return null;
    }

    @Override
    public int getEdad() {
        return this.edad;
    }
    @Override
    public String toString() {
        return "Nombre :"+this.getNombre()+" Apellido : "+this.getNombre()+" Edad : "+this.getEdad();
    }

}
