package TPE_Programacion.Comparadores;

import TPE_Programacion.ElementoParticipante;

import java.util.Comparator;

public abstract class Comparador implements Comparator<ElementoParticipante> {

	@Override
	public abstract int compare(ElementoParticipante o1, ElementoParticipante o2);


}
