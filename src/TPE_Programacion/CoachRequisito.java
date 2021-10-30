package TPE_Programacion;

import TPE_Programacion.Criterio.Filtro;

public class CoachRequisito extends Coach {
    private Filtro filtro;
    //preguntar si se hace otro coach
    public CoachRequisito(String nombre, Filtro filtro) {
        super(nombre);
    }
    public void addParticipante(Participante participante){
        if(filtro.criterio(participante)){
            super.addParticipante(participante);
        }
    }
}
