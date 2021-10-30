package TPE_Programacion.Busqueda;

import TPE_Programacion.Participante;

import java.util.ArrayList;

public class BusquedaIdioma implements Busqueda {
    @Override
    public ArrayList compare(ArrayList lista, Participante p) {
        ArrayList cumpleRequsito=new ArrayList();
        for(int i=0;i<p.getIdioma().size();i++) {
            if (!lista.contains(p.getIdioma().get(i))) {
                cumpleRequsito.add(p.getIdioma().get(i));
            }
        }
        return cumpleRequsito;
    }
}
