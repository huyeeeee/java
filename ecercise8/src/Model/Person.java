package Model;

/**
 * Name : Meishuai Li
 * Class : IST 242 WC
 * Program : L03B: Assignment - Interface and Arrays Interface
 * Due Date : 2019-6-9-23:59
 * Honor Pledge: On my honor as a student of Penn State University,
 *              I have neither given nor received unauthorized help on this homework assignment.
 * Name : Meishuai Li
 * Email : mxl465@psu.edu
 * Description : this program defines a class that has five attributes:name,height,weight,hometown,highSchool,
 *              and a method returns a string type data about the a person's basic information
 */

public class Person {
    protected String name;
    protected int weight;
    protected Height height;
    protected String hometown;
    protected String highSchool;

    public Person(){}
    public Person(String name,Height height,int weight,String hometown,String highSchool){

        this.name= name;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }

    /**
     *
     * @param height to set height
     */
    public void setHeight(Height height) {
        this.height = height;
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
     * @return the height
     */
    public Height getHeight() {
        return height;
    }

    /**
     *
     * @return a person's basic information
     */
    @Override
    public String toString() {
        return "" + getName() + " " + getHeight() + " " + getWeight() + " "
                + getHometown() + " " + getHighSchool();
    }
}