package Model;

import java.util.List;

public class Reposibility {
    private TA ta;
    private List<Courses> courseReposiblity; 
    private double expectIncome;

    public Reposibility(TA ta, List<Courses> courseReposiblity) {
        this.ta = ta;
        this.courseReposiblity = courseReposiblity;
        this.expectIncome = calculateIncome();
    } 
    
    private double calculateIncome(){
        double totalIncome = 0;
        double taRate = ta.getRate()/60;
        for(Courses course : courseReposiblity){
            double totalWorkingTime = course.getCourseDate().size() * course.getTotalTime();
            totalIncome = totalIncome + (taRate * totalWorkingTime);
        }
        return totalIncome;
    }

    public void getCourseReposiblity() {
        for(Courses course : courseReposiblity){
            System.out.println("\t" + course.getCourseID());
        }
    }
    
    public void ReposibilityInfo(){
        System.out.println("TA name : " + ta.getFirstName() + " " + ta.getLastName());
        System.out.println("Reposibility on :");
        getCourseReposiblity();
        System.out.println("This semester will make : " + this.expectIncome + " Bath");

    }
}
