package src.StudentManager;

import java.awt.*;
import java.util.ArrayList;

public class StuffImp implements Stuff {
    //create fileds
    private List<Job> jobs;
    private String hobby;
    //create constructor
    public StuffImp(List<Job>, String hobby) {
        //create new list.
        jobs = new ArrayList<>();
        this.hobby = hobby;
    }

    @Override
    public void askJob() {
        System.out.println("Job: " + Job);
    }

    @Override
    public void askHobby() {
        System.out.println("Hobby: " + hobby);
    }

    @Override
    public int getTotalSalary() {
        return ;
    }
}
