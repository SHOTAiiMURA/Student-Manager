package StudentManager;

public interface Professor extends Person {
    void startCourse(Course course);

    boolean isTeachingCourse(Course course);
}