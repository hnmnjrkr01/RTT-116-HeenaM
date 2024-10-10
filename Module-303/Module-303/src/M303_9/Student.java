package M303_9;

public class Student {

    private int studentID;
    private String firstName;
    private String lastName;
    private String studentEmail;
    private long studentPhone;

    public Student() {

    }

    public Student(int studentID, String firstName, String lastName, String studentEmail, long studentPhone) {
         this.studentID = studentID;
         this.firstName = firstName;
         this.lastName = lastName;
         this.studentEmail = studentEmail;
         this.studentPhone = studentPhone;
        }


    public int getStudentID() {
        return studentID;
    }

    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public long getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(long studentPhone) {
        this.studentPhone = studentPhone;
    }



}
