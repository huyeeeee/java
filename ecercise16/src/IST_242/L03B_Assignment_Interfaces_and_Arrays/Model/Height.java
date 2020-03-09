package IST_242.L03B_Assignment_Interfaces_and_Arrays.Model;

/**
 * Name : Meishuai Li
 * Class : IST 242 WC
 * Program : L03B: Assignment - Interface and Arrays
 * Due Date : 2019-6-9-23:59
 * Honor Pledge: On my honor as a student of Penn State University,
 *              I have neither given nor received unauthorized help on this homework assignment.
 * Name : Meishuai Li
 * Email : mxl465@psu.edu
 * Description : this program defines a class that has five attributes:name,height,weight,hometown,highSchool,
 *              and a method returns a string type data about the a person's basic information
 */


public class Height {
    private int feet;
    private int inches;

    Height(){}
    Height(int feet,int inches){
        this.feet = feet;
        this.inches = inches;
    }

    /**
     * @param feet to set feet
     */
    public void setFeet(int feet) {
        this.feet = feet;
    }

    /**
     * @param inches to set inches
     */
    public void setInches(int inches) {
        this.inches = inches;
    }

    /**
     * @return the feet
     */
    public int getFeet() {
        return feet;
    }

    /**
     * @return the Inches
     */
    public int getInches() {
        return inches;
    }

    /**
     * @return height as a string
     */
    @Override
    public String toString() {
        return getFeet() + "'" + getInches() +"\"";
    }


}
