package CentroComputos;

import java.util.ArrayList;

public class CentroComputo {

    private ArrayList<Computadora> computadoras;
    private ArrayList<Proceso> procesos;


    public CentroComputo() {
        this.computadoras = new ArrayList<>();
        this.procesos = new ArrayList<>();
    }

    public void addComputadora(Computadora compu){
        boolean inserto = false;
        int i = 0;
        while (!inserto && i<computadoras.size()){
            if(compu.getVelocidadCPU() > computadoras.get(i).getVelocidadCPU()){
                computadoras.add(i,compu);
                inserto = true;
            }
            i++;
        }
        if(!inserto)
            computadoras.add(compu);
    }

    public ArrayList<Computadora> getComputadoras(){
        return new ArrayList<>(computadoras);
    }
}
