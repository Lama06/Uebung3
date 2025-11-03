package h3;

public class H3_main {
    public static void main(String[] args) {
        int max = 5;
        int fix = 2;
        int wartend = 2;
        boolean istVoll = false;

        int frei = max - fix;
        if (wartend < frei) {
            fix += wartend;
            wartend = 0;
            istVoll = false;
        } else if (wartend == frei) {
            fix = max;
            wartend = 0;
            istVoll = true;
        } else { // wartend > frei
            fix = max;
            wartend -= frei;
            istVoll = true;
        }

        System.out.println(fix);
        System.out.println(wartend);
        System.out.println(istVoll);
    }
}
