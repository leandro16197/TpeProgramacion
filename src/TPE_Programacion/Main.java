package TPE_Programacion;

import TPE_Programacion.Comparadores.CompEdad;


public class Main {
    public static void main(String []args){

        Participante pepe=new Participante("pepe","pipito",23);
        pepe.addGenero("rock");
        pepe.addIdioma("ingles");


        Participante pepe2=new Participante("carlito","carlos",33);
        pepe2.addGenero("rock");
        pepe2.addGenero("cumbia");
        pepe2.addIdioma("ingles");
        pepe2.addInstrumento("triangulo");

        CompEdad edad=new CompEdad();
        Coach c=new Coach("coach");
        c.addParticipante(pepe);
        c.addParticipante(pepe2);

        Coach c2=new Coach("coach2");
        Participante carlos=new Participante("carlos","c",2);
        carlos.addGenero("rock");
        carlos.addIdioma("ingles");


        Participante kun=new Participante("kun","b",1);
        kun.addGenero("rock");
        kun.addGenero("cumbia");
        kun.addIdioma("ingles");
        kun.addInstrumento("triangulo");
        c2.addParticipante(kun);
        c2.addParticipante(carlos);
        System.out.println(c2.getParticipantes());

        Reality r=new Reality("show",edad);

        r.batalla(c.getListaParticipantesOrdenada(r.getComp()).get(0),
                c2.getListaParticipantesOrdenada(r.getComp()).get(0));

    }
}
