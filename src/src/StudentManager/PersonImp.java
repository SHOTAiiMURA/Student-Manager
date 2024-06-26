package src.StudentManager;

public class PersonImp implements Person{

    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String gender;

    public PersonImp(String name, String phoneNumber, String email, String address, String gender) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.gender = gender;
    }

    @Override
    public void hello() {
        System.out.println("Hello " + name);
    }

    @Override
    public void askGender() {
        System.out.println("I'm" + gender);
    }
    public void askPersonalinfo(){
        System.out.println("My personal info are"+ phoneNumber + " " + email + " " + address + " " + gender);
    }

    @Override
    public void askJob(Job job) {
        System.out.println("Job: " + Job);
    }

    @Override
    public void askHobby(String hobby) {
        System.out.println("Hobby: " + hobby);
    }

    @Override
    public int getTotalSalary() {
        return getTotalSalary();
    }
}