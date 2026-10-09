public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int realMinutes) {
        int expectedMinutes = expectedMinutesInOven();
        if (realMinutes >= expectedMinutes) return 0;
        return expectedMinutes - realMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        if (layers < 0) {
            return 0;
        }
        return 2 * layers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int realMinutes) {
        return preparationTimeInMinutes(layers) + realMinutes;
    }
}
