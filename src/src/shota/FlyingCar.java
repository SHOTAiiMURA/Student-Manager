package src.shota;

public class FlyingCar extends Car{
    private int altitude;

    public FlyingCar(int weight, int height, int noWheel, int noSheet) {
        super(weight, height, noWheel, noSheet);
        altitude = 0;
    }
}
