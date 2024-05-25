package src.StudentManager;

public interface Student extends Person{
    int getStudentID();
    String getMajor();
    int getGrade();
    float getGPA();
    void takeCourse(Course course);
    void finishCourser(Course course);

    boolean isTakingCourse(Course course);
    void askCourses();
}
