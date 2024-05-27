package src.StudentManager;

public class JobImp implements Job {
    private String title;
    private int salary;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
