package StudentManager;

//import java.util.List;
//import java.util.ArrayList;
import java.util.*;


public class ProfImp extends PersonImp implements Professor {
    //create fileds
    private List<Course> teachingCourse;
    private int salary;
    // create constructor
    public ProfImp(String name, String phoneNumber, String email, String address, String gender) {
        super(name, phoneNumber, email, address, gender);
        teachingCourse = new ArrayList<>();
        salary = 0;
    }
    @Override
    public void startCourse(Course course) {
        teachingCourse.add(course);
    }

    @Override
    public boolean isTeachingCourse(Course course) {
        return false;
    }

    @Override
    public void askGender() {
        System.out.println("Dont talk to me like that");
    }
}