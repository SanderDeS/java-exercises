package oefeningen;


public class Triangle {
    public void draw(int n) {
        for (int row = 0; row < n; row++) {
            printXTimes(row, ". ");
            printXTimes(n-row, "* ");
            System.out.println();
        }
    }

    private void printXTimes(int count, String s) {
        for (int i = 0; i < count; i++) {
            System.out.print(s);
        }
    }
}
