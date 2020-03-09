public class Student extends Person {
    private int studentID;
    private String major;
    private String department;

    //constructor
    public Student(){
        super();
        studentID = 0;
        major = null;
        department = null;
    }
    public Student(String name,String sex,int age,Height height,int studentID,String major,String department){
        super(name, sex, age, height);
        this.studentID = studentID;
        this.major = major;
        this.department = department;
    }

    //setter and getter methods
    public String getDepartment() {
        return department;
    }

    public String getMajor() {
        return major;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     *
     * @return a student's basic information
     */
    @Override
    public String toString() {
        return super.toString()+
                "studentID: "+studentID+"\n"+
                "major: "+major+"\n"+
                "department: "+department+"\n";
    }
}
