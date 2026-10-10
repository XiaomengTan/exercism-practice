public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int travelDistance;

    public ExperimentalRemoteControlCar() {
        this.travelDistance = 0;
    }

    public void drive() {
        this.travelDistance += 20;
    }

    public int getDistanceTravelled() {
        return this.travelDistance;
    }
}
