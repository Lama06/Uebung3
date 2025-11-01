package h1;

public class H1_main {
    public static void main(String[] args) {
        double guthaben = -100;
        double monEingang = 200;

        int rating = -2;

        boolean warnhinweis = false;
        boolean negativ = false;


        negativ = guthaben < 0;

        if (guthaben > 0) {
            rating += 3;
        }

        if (guthaben == 0) {
            rating += 2;
        }

        if (guthaben < 0 && monEingang >= -guthaben) {
            rating++;
        }

        if (guthaben < 0 && monEingang < -guthaben) {
            rating--;
        }

        warnhinweis = guthaben < 0 && monEingang < -guthaben && rating < 0;
    }
}
