package oefeningen;

import java.util.Random;

public class Dobbelsimulator {

    public static void main(String[] args) {
        int dobbel = gooiDobbelsteen();
        System.out.println(dobbel);
    }
    public static int gooiDobbelsteen() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public int gooiXDobbelstenen(int x) {
        int som = 0;
        for (int i = 0; i < x; i++) {
            som = som + gooiDobbelsteen();
        }
        return som;
    }

    public int aantalKeerSom(int aantalDobbelstenen, int som, int aantalKeerGooien) {

        int aantal = 0;
        for (int i = 0; i < aantalKeerGooien; i++) {

            if (gooiXDobbelstenen(aantalDobbelstenen) == som) {
                aantal++;
            }
        }
        return aantal;

    }

}
