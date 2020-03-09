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
 *              and five methods,method toString returns a string type data about the a person's basic information，
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
    FootballPlayer(){}
    FootballPlayer(int number,String name,String position,int feet,int inches,int weight,String hometown,String highSchool){
        super(name,feet,inches,weight,hometown,highSchool);

        this.number = number;
        this.position = position;
        List list = Arrays.asList(name,getFeet() + "'" + getInches() + "\"",weight,hometown
                ,highSchool,number,position);
        Attribute.addAll(list);
        AttributeNames.addAll(Arrays.asList("name","height","weight","hometown"
                ,"highSchool","number","position"));
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
        return super.toString()
                + "\nnumber : " + getNumber()
                + "\nposition : " + getPosition();
    }

    /**
     *
     * @return the name of all attributes as an ArrayList of Strings.
     */
    @Override
    public ArrayList<String> getAttributeNames() {
        return AttributeNames;
    }

    /**
     *
     * @param n start with 0 for the first attribute, then 1 for the second attribute and so on.
     * @return the value of a specific attribute
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
     * @return the name of a specific attribute
     */
    @Override
    public String getAttributeName(int n) {
        return AttributeNames.get(n);
    }

}
