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
 * Description : This program has one attribute "sts" to store a students' basic information and
 *              one method which has a parameter "n" (except get and set methods) to return
 *              the (n+1)-th student's information
 */


import java.util.ArrayList;

public class Model
{

    ArrayList<Student> sts = new ArrayList<>();

    public Model()
    {
        //creates 3 students
        MailAddress addr1 = new MailAddress("107 W College Avenue", "State College", "PA", 16801);
        Student st1 = new Student("Emily", "Smith", 20, addr1);
        MailAddress addr2 = new MailAddress("200 W College Avenue", "State College", "PA", 16801);
        Student st2 = new Student("Mary", "Doe", 20, addr2);
        MailAddress addr3 = new MailAddress("300 W College Avenue", "State College", "PA", 16801);
        Student st3 = new Student("John", "Doe", 20, addr3);
        //add them to the array of students
        sts.add(st1);
        sts.add(st2);
        sts.add(st3);
    }


    public ArrayList<Student> getSts() {
        return sts;
    }

    /**
     *
     * @param n is the student's number in ArrayList sts
     * @return the (n-1)th student's basic information
     */
    public String findStudent(int n){
        return sts.get(n).getInfo();
    }
}
