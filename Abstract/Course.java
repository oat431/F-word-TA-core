package Abstract;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public abstract class Course {
    protected String courseID;
    protected List<LocalDate> courseDate;
    protected LocalTime courseStartTime;
    protected LocalTime courseEndTime;
    protected double totalTime;

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

    public abstract long duration();

    public abstract void initTime();

}
