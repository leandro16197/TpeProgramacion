package CentroComputos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CentroComputo unicen = new CentroComputo();

        Computadora compu1 = new Computadora("lab1", 255.0);
        Computadora compu2 = new Computadora("lab2", 120.0);
        Computadora compu3 = new Computadora("lab3", 1112.0);


        unicen.addComputadora(compu1);
        unicen.addComputadora(compu2);
        unicen.addComputadora(compu3);

        ArrayList<Computadora> compus = unicen.getComputadoras();

        System.out.println(compus);


    }
}
