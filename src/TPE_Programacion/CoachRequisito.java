package TPE_Programacion;

import TPE_Programacion.Criterio.Filtro;

public class CoachRequisito extends Coach {
    private Filtro filtro;

    public CoachRequisito(String nombre, Filtro filtro) {
        super(nombre);
        this.filtro = filtro;
    }

    public void addParticipante(ElementoParticipante e){
        if(filtro.criterio(e)){
            super.addParticipante(e);
        }
    }
}
