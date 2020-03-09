public class Teacher extends Person{
    private int teacherID;
    private String teachingCourses;
    private int teachingAge;

    //constructor
    public Teacher(){
        super();
        teacherID = 0;
        teachingCourses = null;
        teachingAge = 0;
    }
    public Teacher(String name,String sex,int age,Height height,int teacherID,String teachingCourses,int teachingAge){
        super(name, sex, age, height);
        this.teacherID = teacherID;
        this.teachingCourses = teachingCourses;
        this.teachingAge = teachingAge;
    }

    //getter and setter methods
    public int getTeacherID() {
        return teacherID;
    }

    public String getTeachingCourses() {
        return teachingCourses;
    }

    public int getTeachingAge() {
        return teachingAge;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public void setTeachingAge(int teachingAge) {
        this.teachingAge = teachingAge;
    }

    public void setTeachingCourses(String teachingCourses) {
        this.teachingCourses = teachingCourses;
    }

    /**
     *
     * @return a teacher's basic information
     */
    @Override
    public String toString() {
        return super.toString()+
                "teacherID: "+teacherID+"\n"+
                "teachingCourses: "+teachingCourses+"\n"+
                "teachingAge: "+teachingAge+"\n";
    }
}
