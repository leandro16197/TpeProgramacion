package TPE_Programacion;


import TPE_Programacion.Criterio.Filtro;

import java.util.ArrayList;

public abstract class ElementoParticipante {
    private String nombre;

    public ElementoParticipante(String nombre) {
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract int getEdad();
    public abstract ArrayList<String>  getPreferenciaMusical();
    public abstract ArrayList<String> getIdiomas();
    public abstract int cantInstrumento();
    public abstract int cantGenero();
    public abstract int cantIdioma();
    public abstract int getCantidadGrupo();

    public abstract ArrayList<ElementoParticipante> getCantantes(Filtro f);
    public abstract ArrayList<String> getListaInstrumentos();
    public abstract ArrayList<String> getListaGenero();

    //criterios
    public abstract boolean cumpleInstrumento(String instrumento);
    public abstract boolean cumpleIdioma(String idioma);
    public abstract boolean cumpleGenero(String genero);

    //criterio TemaMusical preguntar
    public abstract boolean preferencia(ArrayList genero);
    public abstract boolean cumpleInstrumento(ArrayList instrumentos);
    public abstract boolean TemaMuscial(TemaMusical t);
}
