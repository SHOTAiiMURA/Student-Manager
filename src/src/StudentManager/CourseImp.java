package StudentManager;

public class CourseImp implements Course{
    private String title;

    public CourseImp(String title) {
        this.title = title;

    }
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "CourseImp{" +
                "title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        Course course = new CourseImp("Math");
        System.out.println(course);
    }
}