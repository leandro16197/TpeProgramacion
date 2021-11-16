package TPE_Programacion;

import TPE_Programacion.Comparadores.CompEdad;
import TPE_Programacion.Comparadores.CompGenero;
import TPE_Programacion.Comparadores.Comparador;




public class Main {
    public static void main(String []args){

        //ejemplo main

        Participante pepe=new Participante("pepe","pipito",23);
        pepe.addGenero("rock");
        pepe.addIdioma("ingles");
        pepe.addIdioma("ruso");


        Participante pepe2=new Participante("carlito","carlos",33);
        pepe2.addGenero("rock");
        pepe2.addGenero("cumbia");
        pepe2.addIdioma("ingles");
        pepe2.addIdioma("2");
        pepe2.addIdioma("3");
        pepe2.addInstrumento("triangulo");

        CompEdad edad=new CompEdad();
        Coach c=new Coach("coach");

        Coach c2=new Coach("coach2");
        Participante carlos=new Participante("carlos","c",2);
        carlos.addGenero("rock1");
        carlos.addGenero("rock2");
        carlos.addGenero("rock3");
        carlos.addGenero("rock4");

        carlos.addIdioma("inges");
        carlos.addIdioma("ingles");
        carlos.addIdioma("inles");

        Participante kun=new Participante("kun","b",1);
        kun.addGenero("rock");
        kun.addGenero("cumbia");
        kun.addIdioma("ingles");
        kun.addIdioma("algo");
        kun.addIdioma("alg");
        kun.addIdioma("otroIdioma");

        kun.addInstrumento("triangulo");
        Produccion p=new Produccion();
        p.addCoach(c);
        p.addCoach(c2);
        p.addParticipante(kun);
        p.addParticipante(pepe);
        p.addParticipante(pepe2);
        p.addParticipante(carlos);

        Reality r=new Reality("show",edad);

        System.out.println(r.batalla(c.getListaParticipantesOrdenada(r.getComp()).get(0)
                ,c.getListaParticipantesOrdenada(r.getComp()).get(1)));

        CompGenero genero=new CompGenero();
               r.setComp(genero);

        System.out.println(r.batalla(c.getListaParticipantesOrdenada(r.getComp()).get(0)
                ,c.getListaParticipantesOrdenada(r.getComp()).get(1)));


    }
}
