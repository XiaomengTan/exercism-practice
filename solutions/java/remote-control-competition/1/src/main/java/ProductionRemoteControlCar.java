class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int travelDistance;

    private int numberOfVictories;

    public ProductionRemoteControlCar() {
        this.travelDistance = 0;
    }

    public void drive() {
        this.travelDistance += 10;
    }

    public int getDistanceTravelled() {
        return this.travelDistance;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        // 先按 numberOfVictories 降序
        int carCompare = Integer.compare(this.numberOfVictories, other.getNumberOfVictories());
        // 判断是否为正数，是则表示 this.numberOfVictories > other.numberOfVictories
        if (carCompare > 0) {
            // this 大于 other 在降序场景下，compareTo 返回值应为负数，表示 this 应排在 other 前面
            return -1;
        }
        // 否则返回 0
        return 0;
    }
}
