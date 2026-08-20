class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int count = 0;
        int tong = numberToCheck;
        int temp = numberToCheck;
        int so = 0;
        while (numberToCheck != 0) {
//            for(int i =0;i<=numberToCheck;i++)

            numberToCheck /= 10;
            count++;

        }
        while (temp != 0) {
            int chuso = temp % 10;
            so += Math.pow(chuso, count);
            temp /= 10;
        }

        if (so == tong) {
            return true;
        }
        return false;
    }

}
