package Model;

/**
 * Name : Meishuai Li
 * Class : IST 242 WC
 * Program : L03C : Assignment - MVC
 * Due Date : 2019-6-16-23:59
 * Honor Pledge: On my honor as a student of Penn State University,
 *              I have neither given nor received unauthorized help on this homework assignment.
 * Name : Meishuai Li
 * Email : mxl465@psu.edu
 * Description : This program has five attributes to describe a student's basic information and
 *              two methods (except get and set methods) , the first method returns the five
 *              attributes as a string , the second method reset the attributes credit randomly
 *              return it
 */

public class Student
{
    //---------Declaring attributes----

    String firstName;
    String lastName;
    int age;
    MailAddress address;
    int credits;
    //------------------------------
    //----------Constructor------------

    public Student(String a, String b, int c, MailAddress d)
    {
        firstName = a;
        lastName = b;
        age = c;
        address = d;
        credits = creditsThisSemester();
    }

    /**
     *
     * @param address to set mailAddress
     */
    public void setAddress(MailAddress address) {
        this.address = address;
    }

    /**
     *
     * @param age to set age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @param credits to set credit
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     *
     * @param firstName to set firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @param lastName to set lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @return the credit
     */
    public int getCredits() {
        return credits;
    }

    /**
     *
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return the mailAddress
     */
    public MailAddress getAddress() {
        return address;
    }

    /**
     *
      * @return a student's basic information
     */
    public String getInfo()
    {
        return "NAME = " + firstName + "  " + lastName + "  " + "Age = " + age + ", address=" + address.toString() + " credits=" + credits;
    }

    /**
     *
      * @return the credit in this semester
     */
    public int creditsThisSemester()
    {
        //calculate randomly a new value for credits in the semester
        //and updates the attribute credits
        double dn = Math.random();
        credits = (int) (15.0 * dn);
        return credits;
    }
}
