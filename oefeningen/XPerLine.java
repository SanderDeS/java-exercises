package oefeningen;

public class XPerLine {
    public void printSequence(int min, int max, int perLine) {

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
            if ((i + 1) % perLine == 0) System.out.println();
        }
        System.out.println();
    }
}
