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
 * Description : This program has one attributes to store students' basic information
 *              and four methods , the first method return a specific student's basic
 *              information based on its parameter "number" ,the second and the third
 *              one show a students's basic information except credit and credit respectively
 *              the forth method returns the whole students' information stored in a arrayList.
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

    /**
     *
     * @param number is the student's number store in the arrayList "sts"
     * @return a specific student's basic information based on the parameter "number"
     */
    public String getInfo(int number){
        return getInfo_01(number) + getCredit(number);
    }

    /**
     *
     * @param number is the student's number store in the arrayList "sts"
     * @return a specific student's basic information based on the parameter "number" except credit
     */
    public String getInfo_01(int number){
        return sts.get(number).getInfo_1();
    }

    /**
     *
     * @param number is the student's number store in the arrayList "sts"
     * @return a specific student's credit based on the parameter "number"
     */
    public int getCredit(int number){
        return sts.get(number).creditsThisSemester();
}

    /**
     *
     * @return the whole students' information in a arrayList<String>
     */
    public ArrayList<String> getSts() {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0;i < sts.size();i++)
            temp.add(getInfo(i));
        return temp;
    }
}
