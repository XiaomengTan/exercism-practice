class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (!knightIsAwake) {
            return true;
        } else if (knightIsAwake) {
            return false;
        }
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSpyStatus = knightIsAwake || archerIsAwake || prisonerIsAwake;
        if (canSpyStatus) {
            return true;
        } else if (!canSpyStatus) {
            return false;
        }
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSignalStatus = !archerIsAwake && prisonerIsAwake;
        if (canSignalStatus) {
            return true;
        } else if(!canSignalStatus) {
            return false;
        }
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean canFreeStatus = (petDogIsPresent && !archerIsAwake) ||
            (!petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake);
        if (canFreeStatus) {
            return true;
        } else if(!canFreeStatus) {
            return false;
        }
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }
}
