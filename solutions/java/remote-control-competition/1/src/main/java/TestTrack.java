import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        List<ProductionRemoteControlCar> rankedCars = new ArrayList<>(cars);
        // 使用 ProductionRemoteControlCar 的 compareTo 自然排序
        Collections.sort(rankedCars); 
        return rankedCars;
    }
}
