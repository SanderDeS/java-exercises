package oefeningen;

import java.util.ArrayList;

public class ArrayListUtils {
    public ArrayList<Double> keerOm(ArrayList<Double> list) {
        ArrayList<Double> omgekeerd = new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            omgekeerd.add(list.get(i));
        }
        return omgekeerd;
    }

    public ArrayList<Double> berekenVierkantwortels(ArrayList<Double> list) {
        ArrayList<Double> resultaat = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            resultaat.add(Math.sqrt(list.get(i)));
        }
        return resultaat;
    }

    public void print(ArrayList<Double> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

}
