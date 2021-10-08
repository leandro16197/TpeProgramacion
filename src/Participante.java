import java.lang.reflect.Array;
import java.util.ArrayList;

public class Participante {
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<String>generosMusicales;
    private ArrayList<String>idiomas;
    private ArrayList<String>instrumentos;

    public Participante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.generosMusicales=new ArrayList<>();
        this.idiomas=new ArrayList<>();
        this.instrumentos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
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
    public String toString() {
        return "Nombre :"+this.getNombre()+" Apellido : "+this.getNombre()+" Edad : "+this.getEdad();
    }

}
