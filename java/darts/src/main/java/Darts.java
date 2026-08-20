class Darts {
    int score(double xOfDart, double yOfDart) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        double khoangcach = xOfDart * xOfDart + yOfDart * yOfDart;
        if (khoangcach <= 1) {
            return 10;
        }
        if (khoangcach <= 25) {
            return 5;
        }
        if (khoangcach <= 100) {
            return 1;
        }
        return 0;
    }
}
