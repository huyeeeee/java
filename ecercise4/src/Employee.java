public class Employee implements Comparable<Employee> {
    private int EmployeeID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Department;

    public Employee(int EmployeeID,String FirstName,String LastName,String Email,String Department){
        this.EmployeeID = EmployeeID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Department = Department;
    }
    @Override
    public int compareTo(Employee e) {
        return this.EmployeeID - e.EmployeeID;
    }

    @Override
    public String toString() {
        return EmployeeID+"\t"+FirstName+"\t"+LastName+"\t"+Email+"\t"+Department;
    }

    //getter methods
    public String getEmail() {
        return Email;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public String getDepartment() {
        return Department;
    }
}
