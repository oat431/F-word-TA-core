package Data.MockData;

import java.util.List;

import Abstract.Course;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;


public class WebUI extends Course {
    private List<LocalDate> workingDay;
    private List<LocalTime> workingTime;    

    @Override
    public void initTime(){
        this.workingDay = new ArrayList<>();
        workingDay.add(LocalDate.of(2022,1,14));
        workingDay.add(LocalDate.of(2022,1,21));
        workingDay.add(LocalDate.of(2022,1,28));

        this.workingTime = new ArrayList<>();
        this.workingTime.add(LocalTime.of(14, 30));
        this.workingTime.add(LocalTime.of(16, 30));
    }

    @Override
    public long duration() {
        Duration due = Duration.between(getStartTime(), getEndTime());
        return due.toHours();
    }

    public LocalTime getStartTime(){
        return workingTime.get(0);
    }


    public LocalTime getEndTime() {
        return workingTime.get(1);
    }

    public WebUI(){
        initTime();
        this.courseID = "953262";
        this.courseDate = workingDay;
        this.courseStartTime = getStartTime();
        this.courseEndTime = getEndTime();
        this.totalTime = duration();

    }

    
}
