import java.util.ArrayList;

public class BusquedaInstrumento implements Busqueda{

    @Override
    public ArrayList compare(ArrayList lista1, Participante p) {
        ArrayList cumpleRequsito=new ArrayList();
        for(int i=0;i<p.getInstrumentos().size();i++) {
            if (!lista1.contains(p.getInstrumentos().get(i))) {
                cumpleRequsito.add(p.getInstrumentos().get(i));
            }
        }
        return cumpleRequsito;
    }
}
