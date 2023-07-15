package oefeningen;

import java.util.ArrayList;
import java.util.Random;

public class Controller {

    public void doeTest() {

        Random rand = new Random();


        System.out.println("Oefening 1");
        SomBerekenaar somBerekenaar = new SomBerekenaar();

        System.out.println(somBerekenaar.som1TotNPrefix(10) + somBerekenaar.som1TotN(10));
        System.out.println(somBerekenaar.som1TotNPrefix(500) + somBerekenaar.som1TotN(500));
        System.out.println(somBerekenaar.som1TotNPrefix(4) + somBerekenaar.som1TotN(4));
        System.out.println();

        System.out.println("Oefening 2");
        XPerLine xPerLine = new XPerLine();
        xPerLine.printSequence(100, 119, 5);
        System.out.println();

        System.out.println("Oefening 3");
        Triangle triangle = new Triangle();
        triangle.draw(6);
        System.out.println();

        System.out.println("Oefening 4");
        Sudoku sudoku = new Sudoku();
        int[][] s = {
                {5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}
        };
        sudoku.print(s);
        boolean legal = sudoku.isValid(s);
        System.out.println();

        int[][] s2 = {
                {5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {4,6,1,5,3,7,2,8,9},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}
        };
        sudoku.print(s2);
        legal = sudoku.isValid(s2);
        System.out.println();

        System.out.println("Oefening 5");
        Dobbelsimulator dobbelsimulator = new Dobbelsimulator();
        int aantalKeerGooien = 1000000;
        int aantalDobbelstenen = 3;
        int gewensteSom = 3;

        int aantal = dobbelsimulator.aantalKeerSom(aantalDobbelstenen, gewensteSom, aantalKeerGooien);
        System.out.println("Op " + aantalKeerGooien + " gooien met " + aantalDobbelstenen
                + " dobbelstenen, hebben we " + aantal + " keer " + gewensteSom + " gegooid.");
        System.out.println();

        System.out.println("Oefening 6 en 7");
        ArrayList<Double> list = new ArrayList<>();
        list.add(100.0);
        list.add(250.0);
        list.add(-77.5);

        ArrayListUtils utils = new ArrayListUtils();
        System.out.print("De oorspronkelijke lijst: ");
        utils.print(list);

        ArrayList<Double> omgekeerd = utils.keerOm(list);
        System.out.print("De omgekeerde lijst: ");
        utils.print(omgekeerd);

        ArrayList<Double> wortels = utils.berekenVierkantwortels(list);
        System.out.print("De lijst met vierkantswortels: ");
        utils.print(wortels);
    }

}
