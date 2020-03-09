package Model;

/**
 * Name : Meishuai Li
 * Class : IST 242 WC
 * Program : L04B : Assignment - Basic Listening with MVC
 * Due Date : 2019-6-30:59
 * Honor Pledge: On my honor as a student of Penn State University,
 *              I have neither given nor received unauthorized help on this homework assignment.
 * Name : Meishuai Li
 * Email : mxl465@psu.edu
 * Description : This program has five attributes to describe a student's basic information and
 *              two methods , the first method returns the five attributes as a string , the
 *              second method reset the attributes credit randomly return it
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

    //---------- METHODS --------

    /**
     *
      * @return a student's basic information
     */
    public String getInfo()
    {
        return "NAME = " + firstName + "  " + lastName + "  " + "Age = " + age + ", address=" + address.toString() + " credits=" + credits;
    }

    public String getInfo_1(){
        return "NAME = " + firstName + "  " + lastName + "  " + "Age = " + age + ", address=" + address.toString() + " credits=";
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
