package src.shota;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello World");

        // インスタンス化
        // Instantiate
        Car sedan = new Car(20, 2, 4, 4);
        Car coupe = new Car(20, 2, 2, 2);
        Car randamCar = new Car(20, 2, 5, 5);

        System.out.println(sedan.getWeight());

        System.out.println(sedan.getWeight());
        sedan.describeYourself();

        Car.IdentifyCarType(sedan.getNoWheel(), sedan.getNoSheet());

        System.out.println();
    }
}
