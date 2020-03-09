package IST_242.L03A_Implementing_an_Interface.Model;

/**
 * Name : Meishuai Li
 * Class : IST 242 WC
 * Program : L03A: Assignment - Implementing an Interface
 * Due Date : 2019-6-2-23:59
 * Honor Pledge: On my honor as a student of Penn State University,
 *              I have neither given nor received unauthorized help on this homework assignment.
 * Name : Meishuai Li
 * Email : mxl465@psu.edu
 * Description : this program defines a class that has five attributes:name,height,weight,hometown,highSchool,
 *              and a method returns a string type data about the a person's basic information
 */

public class Person extends Height{
    protected String name;
    protected int weight;
    protected String hometown;
    protected String highSchool;

    public Person(){}
    public Person(String name,int feet,int inches,int weight,String hometown,String highSchool){
        super(feet,inches);
        this.name= name;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }

    /**
     * @param highSchool to set highSchool
     */
    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    /**
     * @param hometown to set hometown
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    /**
     * @param name to set name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param weight to set weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }


    /**
     *
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     *
     * @return the highSchool
     */
    public String getHighSchool() {
        return highSchool;
    }

    /**
     *
     * @return the hometown
     */
    public String getHometown() {
        return hometown;
    }

    /**
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return a person's basic information
     */
    @Override
    public String toString() {
        return "" + getName() + super.toString() + getWeight()
                + getHometown() + getHighSchool();
    }
}
