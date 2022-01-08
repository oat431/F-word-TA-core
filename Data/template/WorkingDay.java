package Data.template;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

public class WorkingDay {
    private List<LocalDate> workingDay;
    private List<LocalTime> workingTime;    

    public WorkingDay(){
        this.workingDay = new ArrayList<>();
        workingDay.add(LocalDate.of(2022,1,14));
        workingDay.add(LocalDate.of(2022,1,21));
        workingDay.add(LocalDate.of(2022,1,28));

        this.workingTime = new ArrayList<>();
        this.workingTime.add(LocalTime.of(14, 30));
        this.workingTime.add(LocalTime.of(16, 30));
    }

    public List<LocalDate> getWorkingDay() {
        return workingDay;
    }

    public List<LocalTime> getWorkingTime() {
        return workingTime;
    }

    public LocalTime getStartTime(){
        return workingTime.get(0);
    }


    public LocalTime getEndTime() {
        return workingTime.get(1);
    }
}
