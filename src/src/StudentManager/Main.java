package src.StudentManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Course math = new CourseImp("Math");
        Course english = new CourseImp("English");
        Course physics = new CourseImp("Physics");

        Student studentA = new StudentImp("John Smith", "090-1234-5678", "A@example.com", "Rainbow avenue 1st", "male");
        Student studentB = new StudentImp("Fan Shon", "050-1234-5678", "B@example.com", "Rainbow avenue 1st", "female");

        Professor professor = new ProfImp("Hani chan", "090-1234-5678", "A@example.com", "Rainbow avenue 1st", "male");
        studentA.hello();
        studentA.askGender();

        studentB.hello();
        studentB.askGender();

        professor.hello();
        professor.askGender();
        System.out.println("=================");
        studentA.takeCourse(math);
        studentA.takeCourse(physics);

        studentB.takeCourse(math);
        studentB.takeCourse(english);

        professor.startCourse(math);

        studentA.askCourses();
        studentB.askCourses();

        // polymorphism
        Person person = new StudentImp("New comer", "090-1234-5678", "A@example.com", "Rainbow avenue 1st", "male");
        person.hello();
        if(person instanceof Student)
        {
            Student student =  ((Student)person);
            student.takeCourse(math);
            student.hello();
            student.askCourses();
        }

        System.out.println("=================");

        List<Person> people = new ArrayList<>();
        people.add(studentA);
        people.add(studentB);
        people.add(professor);
        for(int i = 0; i < people.size(); i++)
        {
            people.get(i).hello();
        }
        System.out.println("=================");
        // Extended For loop
        for(Person p: people)
        {
            p.hello();
        }
    }
}
