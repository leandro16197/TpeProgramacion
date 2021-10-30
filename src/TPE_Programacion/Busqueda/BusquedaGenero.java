package TPE_Programacion.Busqueda;

import TPE_Programacion.Participante;

import java.util.ArrayList;
import java.util.Collections;


public class BusquedaGenero implements Busqueda {
    @Override
    public ArrayList compare(ArrayList lista1, Participante p) {
        ArrayList cumpleRequsito=new ArrayList();
        for(int i=0;i<p.getGenero().size();i++) {
            if (!lista1.contains(p.getGenero().get(i))) {
                cumpleRequsito.add(p.getGenero().get(i));
            }
        }
        Collections.sort(cumpleRequsito);
        return cumpleRequsito;
    }
}
