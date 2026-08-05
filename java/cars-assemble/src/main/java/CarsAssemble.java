public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        //    throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
        double cerperhour = speed * 221;
        double success;
        if (speed >= 1 && speed <= 4) {
            success = 1.0;
        } else if (speed >= 5 && speed <= 8) {
            success = 0.9;
        } else if (speed == 9) {
            success = 0.8;

        } else if (speed == 10) {
            success = 0.77;
        } else {
            success = 0.0;
        }
    return  cerperhour * success;

    }

    public int workingItemsPerMinute(int speed) {
        //  throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
return  (int)(productionRatePerHour(speed)/60);

    }
}
