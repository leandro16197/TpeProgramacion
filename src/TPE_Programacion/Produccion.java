package TPE_Programacion;

import java.util.ArrayList;

public class Produccion {
    private String nombre;
    private ArrayList<TemaMusical>temasMusicales;

    public Produccion(String nombre) {
        this.nombre = nombre;
        this.temasMusicales=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addTemasMusicales(TemaMusical tema){
        this.temasMusicales.add(tema);
    }
    public ArrayList getTemasMusicales(){
        return new ArrayList(this.temasMusicales);
    }
}
