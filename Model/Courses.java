package Model;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class Courses {
    private String courseID;
    private List<LocalDate> courseDate;
    private LocalTime courseStartTime;
    private LocalTime courseEndTime;
    private double totalTime;
    private String fileName;

    public Courses(
        String courseID, 
        LocalTime courseStartTime,
        LocalTime courseEndTime,
        String fileName
    ) throws IOException {
        this.courseID = courseID;
        this.fileName = fileName;
        this.courseStartTime = courseStartTime;
        this.courseEndTime = courseEndTime;
        Duration due = Duration.between(courseStartTime, courseEndTime);
        this.totalTime = due.toMinutes();
        initTime();
    }

    public void initTime() throws IOException {
        this.courseDate = new ArrayList<>();

        File data = new File(this.fileName);
        Scanner in = new Scanner(data);
        while(in.hasNextLine()){
            String raw = in.nextLine();
            String[] exData = raw.split(",");
            this.courseDate.add(
                LocalDate.of(
                    Integer.parseInt(exData[0]),
                    Integer.parseInt(exData[1]),
                    Integer.parseInt(exData[2]) 
                )
            );
        }

        in.close();
    }

    public String getCourseID() {
        return courseID;
    }

    public List<LocalDate> getCourseDate() {
        return courseDate;
    }

    public LocalTime getCourseStartTime() {
        return courseStartTime;
    }

    public LocalTime getCourseEndTime() {
        return courseEndTime;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void getCourseInfomation(){
        System.out.println("Course ID : " + getCourseID());
        System.out.println("Course date : ");
        for(LocalDate workingDate : courseDate){
            System.out.println("\t" + workingDate);
        }
        System.out.println("From : " + getCourseStartTime());
        System.out.println("To : " + getCourseEndTime());

        System.out.println("Total : " + getTotalTime());
    }

}