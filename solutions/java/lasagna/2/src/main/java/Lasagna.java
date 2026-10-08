public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int realMinutes) {
        int expectedMinutes = expectedMinutesInOven();
        if (realMinutes >= expectedMinutes) return 0;
        return expectedMinutes - realMinutes;
    }

    public int preparationTimeInMinutes(int layers) {
        if (layers < 0) {
            return 0;
        }
        return 2 * layers;
    }

    public int totalTimeInMinutes(int layers, int realMinutes) {
        return preparationTimeInMinutes(layers) + realMinutes;
    }
}
