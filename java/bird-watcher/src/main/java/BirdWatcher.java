
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        //   throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
        return new int[]{0, 2, 5, 3, 7, 8, 4};


    }

    public int getToday() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");

        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        //  throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
        this.birdsPerDay[this.birdsPerDay.length - 1]++;

    }

    public boolean hasDayWithoutBirds() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                return true;
            }

        }
        return false;

    }

    public int getCountForFirstDays(int numberOfDays) {
        //   throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
        int num = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            num += this.birdsPerDay[i];
        }
        return num;
    }

    public int getBusyDays() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
        int num2 = 0;
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                num2++;
            }
        }
        return num2;
    }
}
