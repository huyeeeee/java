package Model;


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
 *              and five methods : method toString returns a string type data about the a person's basic information，
 *              and other four methods from Interface TableMember
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FootballPlayer extends Person implements TableMember{
    private int number;
    private String position;
    private ArrayList<String> AttributeNames = new ArrayList<String>();
    private ArrayList<String> Attribute = new ArrayList<String>();
    public FootballPlayer(){}
    public FootballPlayer(String name,Height height,int weight,String hometown,String highSchool,int number,String position){
        super(name,height,weight,hometown,highSchool);

        this.number = number;
        this.position = position;
        setAttribute();
        setAttributeNames();
    }

    /**
     * use this method to set the name of the attribute
     */
    public void setAttributeNames() {
        AttributeNames.addAll(Arrays.asList("number","name","position","height"
                ,"weight","hometown","highSchool"));
    }

    /**
     * use this method to set the value of the attribute
     */
    public void setAttribute() {
        List list = Arrays.asList(getNumber(),getName(),getPosition(),getHeight(),
                getWeight(),getHometown(),getHighSchool());
        Attribute.addAll(list);
    }

    /**
     *
     * @param number to set number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     *
     * @param position to set position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     *
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @return the position
     */
    public String getPosition(){
        return position;
    }

    /**
     *
     * @return a footballPlayer's basic information as a string
     */
    @Override
    public String toString() {
        return getNumber() + " " + getName() + " " + getPosition()
                + " " + getHeight() + " " + getWeight() + " "
                + getHometown() + " " + getHighSchool();
    }

    /**
     *
     * @return the names of all attributes as an ArrayList of Strings.
     */
    @Override
    public ArrayList<String> getAttributeNames() {
        return AttributeNames;
    }

    /**
     *
     * @param n start with 0 for the first attribute, then 1 for the second attribute and so on.
     * @return the value of the (n-1)-th attribute
     */
    @Override
    public String getAttribute(int n) {
        return String.valueOf(Attribute.get(n));
    }

    /**
     *
     * @return the value of all attributes as an ArrayList of Strings.
     */
    @Override
    public ArrayList<String> getAttributes() {
        return Attribute;
    }

    /**
     *
     * @param n start with 0 for the first attribute, then 1 for the second attribute and so on
     * @return the name of the (n-1)-th attribute
     */
    @Override
    public String getAttributeName(int n) {
        return AttributeNames.get(n);
    }

}
