import java.util.ArrayList;

public class Coach {
    private String nombre;
    private ArrayList<Participante>participantes;
    //preguntar si nesesita atributo para saber si es jurado o no
    public Coach(String nombre) {
        this.nombre = nombre;
        this.participantes=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addParticipante(Participante participante){
        this.participantes.add(participante);
    }
    public ArrayList getParticipantes(){
        return new ArrayList(this.participantes);
    }

    public ArrayList getCantantes(Criterio compor){
        ArrayList<Participante>listaAux = new ArrayList();
        for (int i=0;i<this.participantes.size();i++){
            if(compor.criterio(this.participantes.get(i))){
                listaAux.add(this.participantes.get(i));
            }
        }
        return listaAux;
    }

    public ArrayList getLista(Busqueda busqueda) {
        ArrayList listaAux = new ArrayList();
        //preguntar si se tienen que pasar 2 tipos iguales o pueden ser distintos tipos de objetos
        for(int i=0;i<this.participantes.size();i++){
            listaAux=busqueda.compare(listaAux,this.participantes.get(i));
        }
        return listaAux;
    }

    public double promedioEdad(){
        double promedio=0.0;
        for (int i=0;i<this.participantes.size();i++){
            promedio+= this.participantes.get(i).getEdad();
        }
        return promedio/this.participantes.size();
    }
        @Override
        public String toString () {
            return "Coach Nombre : " + this.getNombre();
        }
}
