package src.StudentManager;
import java.util.ArrayList;
import java.util.List;

public class StudentImp extends PersonImp implements Student {
    //fileds
    private int studendID;
    private String major;
    private int grade;
    private float gpa;
    private List<Course> attendingCourse;
    private List<Course> finishCourse;

    //constructor
    public StudentImp(String name, String phoneNumber, String email, String address, String gender) {
        super(name, phoneNumber, email, address, gender);
        //create a new list
        attendingCourse = new ArrayList<>();
        finishCourse = new ArrayList<>();
    }

    @Override
    public int getStudentID() {
        return studendID;
    }

    @Override
    public String getMajor() {
        return major;
    }

    @Override
    public int getGrade() {
        return grade;
    }

    @Override
    public float getGPA() {
        return gpa;
    }

    @Override
    public void takeCourse(Course course) {
        attendingCourse.add(course);
    }

    @Override
    public void finishCourser(Course course) {
        finishCourse.add(course);
    }

    @Override
    public boolean isTakingCourse(Course course) {
        return false;
    }

    @Override
    public void askCourses() {
        for(int i = 0; i < attendingCourse.size(); i++)
        {
            System.out.println(attendingCourse.get(i));
        }
    }

}