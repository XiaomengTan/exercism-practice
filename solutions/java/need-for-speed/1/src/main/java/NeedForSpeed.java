class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int battery;
    private int distanceDriven;
    
    public NeedForSpeed(int speed, int batteryDrain) {
        // 行进速度
        this.speed = speed;
        // 耗电百分比
        this.batteryDrain = batteryDrain;
        // 车电量，初始为 100
        this.battery = 100;
        // 累计行进距离，初始为 0
        this.distanceDriven = 0;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        // 如果剩余电量大于或等于耗电百分比，则行进
        if (!this.batteryDrained()) {
            this.battery -= this.batteryDrain;
            this.distanceDriven += this.speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getBatteryDrain() {
        return this.batteryDrain;
    }

    public int getBattery() {
        return this.battery;
    }
}

class RaceTrack {
    private int distance;
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        // 获取对象中的字段值
        int speed = car.getSpeed();
        int batteryDrain = car.getBatteryDrain();
        int battery = car.getBattery();
        // 用总电量除以耗电量，计算商（向下取整）
        int divde = (int) (battery / batteryDrain);
        // 计算最大行驶距离
        int maxDistance = speed * divde;
        // 比较是否大于当前赛道
        return !(this.distance > maxDistance);
    }
}
