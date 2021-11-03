package TPE_Programacion;


import TPE_Programacion.Comparadores.Comparador;
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

    //Preguntar comparador para preferenciaMuscical
    public abstract ArrayList getPreferenciaMusical();
    public abstract ArrayList<String> getIdiomas();
    public abstract ArrayList<String> getInstrumento();
    public abstract int cantInstrumento();
    public abstract int cantGenero();
    public abstract int cantIdioma();
    public abstract int getCantidadGrupo();
    //public abstract ArrayList getLista(Busqueda busqueda);
    public abstract ArrayList getCantantes(Filtro f);
    public abstract ArrayList getListaInstrumentos();
    public abstract ArrayList getListaGenero();
}
