package TPE_Programacion;

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
    public abstract ArrayList getPreferenciaMusical();
}
