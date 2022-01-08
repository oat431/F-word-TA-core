package Model;

public class TA {
    private String firstName;
    private String lastName;
    private String studentID;
    private double rate;

    public TA(String firstName, String lastName, String studentID, double rate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.rate = rate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public double getRate() {
        return rate;
    }

}
