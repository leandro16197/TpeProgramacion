import java.util.ArrayList;

public class Reality {
    private String nombre;
    private ArrayList<Coach>coaches;
    private ArrayList<Participante>participantes;

    public Reality(String nombre) {
        this.nombre = nombre;
        this.coaches=new ArrayList<>();
        this.participantes=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void addCoach(Coach coach){
        this.coaches.add(coach);
    }
    public void addParticipante(Participante participante){
        this.participantes.add(participante);
    }
    public ArrayList getCoaches(){
        return new ArrayList(this.coaches);
    }
    public ArrayList getParticipantes(){
        return new ArrayList(this.participantes);
    }

    @Override
    public String toString() {
        return "Reality Nombre : "+this.getNombre();
    }
}
