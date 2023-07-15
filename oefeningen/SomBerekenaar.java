package oefeningen;

public class SomBerekenaar {

    public int som1TotN(int n) {
        int som = 0;
        for (int i = 1; i <= n; i++) {
            som = som + i;
        }
        return som;
    }

    public String som1TotNPrefix(int n) {
        return "De som van de getallen 1 tot en met " + n + " bedraagt ";
    }
}
