public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int validSpeed = getValidSpeed(speed);
        if (validSpeed == 0) {
            // 关闭
            return 0.0;
        }
        if (validSpeed <= 4) {
            return computeRatePerHour(validSpeed, 1.0);
        }
        if (validSpeed >= 5 && validSpeed <=8) {
            return computeRatePerHour(validSpeed, 0.9);
        }
        if (validSpeed == 9) {
            return computeRatePerHour(validSpeed, 0.8);
        }
        if (validSpeed == 10) {
            return computeRatePerHour(validSpeed, 0.77);
        }
        return 0.0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }

    private int getValidSpeed(int speed) {
        if(speed > 0) {
            return speed;
        } else {
            return 0;
        }
    }

    private double computeRatePerHour(int speed, double successRate) {
        return speed * 221 * successRate;
    }
}
