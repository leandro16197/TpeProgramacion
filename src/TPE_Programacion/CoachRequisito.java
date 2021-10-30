package TPE_Programacion;

import TPE_Programacion.Criterio.Criterio;

public class CoachRequisito extends Coach {
    private Criterio criterio;
    //preguntar si se hace otro coach
    public CoachRequisito(String nombre, Criterio criterio) {
        super(nombre);
    }
    public void addParticipante(Participante participante){
        if(criterio.criterio(participante)){
            super.addParticipante(participante);
        }
    }
}
