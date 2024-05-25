package shota;

public class Car {
    // public, private, protected

    // Encapsulation
    private int weight;
    private int height;
    private int noWheel;
    private  int noSheet;

    // Constructor
    // Manual
    public Car(int weight, int height, int noWheel, int noSheet)
    {
        this.weight = weight;
        this.height = height;
        this.noWheel = noWheel;
        this.noSheet = noSheet;
        verifyCar();
    }

    // Sendan
    // Overload
    public Car(int weight, int height)
    {
        this(weight, height, 4, 4);
    }

    // Getter Setter
    public int getWeight(){
        return weight;
    }

    public int getNoWheel() {
        return noWheel;
    }

    public int getNoSheet() {
        return noSheet;
    }

    public String describeYourself()
    {
        return String.format("Weight %d, Height %d, Wheel %d, Sheet %d", weight, height, noWheel, noSheet);
    }

    public boolean verifyCar()
    {
        if(noWheel == 2 && noSheet == 2)
        {
            System.out.println("Coupe Created");
            return true;
        }
        else if(noWheel == 4 && noSheet == 4)
        {
            System.out.println("Sedan Created");
            return true;
        }
        else{
            System.out.println("Invalid car type");
            return false;
        }
    }

    public static void IdentifyCarType(int noWheel, int noSheet)
    {
        if(noWheel == 2 && noSheet == 2)
        {
            System.out.println("Coupe");
        }
        else if(noWheel == 4 && noSheet == 4)
        {
            System.out.println("Sedan");
        }
        else{
            System.out.println("Invalid car type");
        }
    }
}
