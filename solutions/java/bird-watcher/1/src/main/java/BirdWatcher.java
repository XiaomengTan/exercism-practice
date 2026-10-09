
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        int length = this.birdsPerDay.length;
        return this.birdsPerDay[length - 1];
    }

    public void incrementTodaysCount() {
        int length = this.birdsPerDay.length;
        this.birdsPerDay[length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int dayCount : this.birdsPerDay) {
            if (dayCount == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int[] copy = this.birdsPerDay;
        for(int i = 0; i < numberOfDays && i < copy.length; i++) {
            sum += copy[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyCount = 0;
        for(int dayCount : this.birdsPerDay) {
            if (dayCount >= 5) busyCount++;
        }
        return busyCount;
    }
}
