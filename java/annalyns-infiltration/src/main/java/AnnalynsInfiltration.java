class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
//        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        //    throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
        if (knightIsAwake || archerIsAwake || prisonerIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        //  throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
        if (prisonerIsAwake && !archerIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        //  throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
        if ((petDogIsPresent && !archerIsAwake) || (!archerIsAwake && !knightIsAwake && prisonerIsAwake)) {
            return true;
        } else {
            return false;
        }
    }
}