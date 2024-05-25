package shota;

public class MovableCar extends Car{
    private int speed;
    private int fuel;

    public MovableCar(int weight, int height, int noWheel, int noSheet)
    {
        super(weight, height, noWheel, noSheet);
        speed = 0;
        fuel = 0;
    }

    public String describeYourself(){
        return super.describeYourself() + " Speed: " + speed + " Fuel " + fuel;
    }

    public void addFuel(int fuel)
    {
        if(fuel < 0)
        {
            System.out.println("No negative fuel!!!");
            return;
        }
        this.fuel += fuel;
    }

    public void addFuel(MovableCar car)
    {
        int transferringFuel = car.fuel;
        car.fuel = 0;
        addFuel(transferringFuel);
    }

    public void addFuel()
    {
        addFuel(1);
    }

    public void speedUp()
    {
        if(fuel > 0)
            fuel--;
        else
        {
            System.out.println("Cannot speed up");
            return;
        }
        speed ++;
    }

    public void sppedDown()
    {
        speed--;
    }

    public void stop()
    {
        speed = 0;
    }

    public static void main(String[] args)
    {
        MovableCar movableCarHeavy = new MovableCar(20, 3, 4, 4);
        MovableCar movableCarLight = new MovableCar(10, 2, 4, 4);

        System.out.println("Movable Car Heavy");
        System.out.println(movableCarHeavy.describeYourself());

        System.out.println("Movable Car Light");
        System.out.println(movableCarLight.describeYourself());

        System.out.println("\n");

        movableCarHeavy.addFuel(4);

        movableCarLight.addFuel(2);

        System.out.println("Movable Car Heavy");
        System.out.println(movableCarHeavy.describeYourself());

        System.out.println("Movable Car Light");
        System.out.println(movableCarLight.describeYourself());

        System.out.println("\n");

        movableCarHeavy.addFuel(movableCarLight);

        System.out.println("Movable Car Heavy");
        System.out.println(movableCarHeavy.describeYourself());

        System.out.println("Movable Car Light");
        System.out.println(movableCarLight.describeYourself());
    }
}
