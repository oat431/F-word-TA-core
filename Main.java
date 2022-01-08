import java.io.IOException;
import java.time.LocalTime;

// import Abstract.Course;
// import Data.MockData.WebUI;
import Model.Courses;
import Model.Reposibility;
import Model.TA;
import java.util.List;
import java.util.ArrayList;

public class Main{

    private static List<Courses> courseList = new ArrayList<>();
    private static TA ta = new TA("Sahachan","Tippimwong","622115039",120);

    private static void initCoure() throws IOException{
        Courses webUI = new Courses(
            "953262",
            LocalTime.of(14, 30),
            LocalTime.of(16, 30),
            "E:\\Website\\PersonalProject\\Java_proj\\F-Word-TA-Core\\Data\\RealData\\WebUI.csv" 
        );

        Courses OOP = new Courses(
            "953231", 
            LocalTime.of(9, 00),
            LocalTime.of(11, 00),
            "E:\\Website\\PersonalProject\\Java_proj\\F-Word-TA-Core\\Data\\RealData\\OOP.csv" 
        );

        courseList.add(webUI);
        courseList.add(OOP);
    }

    public static void main(String[] args) throws IOException {
        initCoure();
        
        Reposibility sahachanRes = new Reposibility(ta,courseList);
        sahachanRes.ReposibilityInfo();
    }
}