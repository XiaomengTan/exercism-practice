public class JedliksToyCar {
    private Integer percentage;

    private Integer meters;

    public JedliksToyCar() {
        this.percentage = 100;
        this.meters = 0;
    }
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.meters + " meters";
    }

    public String batteryDisplay() {
        // 检查电量是否耗尽
        if (this.percentage != 0)
            return "Battery at " + this.percentage + "%";
        else return "Battery empty";
    }

    public void drive() {
        // 先检查电量是否耗尽
        if (this.percentage != 0) {
            // 电量没有耗尽，本次 drive 继续消耗电量并增加米数
            this.percentage -= 1;
            this.meters += 20;
        }
        // 已耗尽，不做任何操作
    }
}
