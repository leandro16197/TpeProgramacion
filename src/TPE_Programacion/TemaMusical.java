package TPE_Programacion;

import java.util.ArrayList;

public class TemaMusical {
    private String titulo;
    private String idioma;
    private ArrayList<String>listaGeneros;
    private ArrayList<String>listaInstrumentos;

    public TemaMusical(String titulo, String idioma) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.listaGeneros=new ArrayList<>();
        this.listaInstrumentos=new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public void addGenero(String genero){
        this.listaGeneros.add(genero);
    }
    public void addInstrumento(String instrumento){
        this.listaInstrumentos.add(instrumento);
    }

    public ArrayList<String> getGenero(){
        return new ArrayList(this.listaGeneros);
    }
    public ArrayList getInstrumentos(){
        return new ArrayList(this.listaInstrumentos);
    }
    @Override
    public String toString() {
        return "Titulo : "+this.getTitulo()+" Idioma : "+this.getIdioma();
    }
}
