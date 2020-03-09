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
 * Description : This program has four attributes to form a mail address and a method (except set
 *              and get methods) to return the four attributes as a string
 */

public class MailAddress
{

    String streetAddress;
    String city;
    String state;
    int zipcode;


    public MailAddress(String inf_streetAddress, String inf_city, String inf_state, int inf_zipcode)
    {
        streetAddress = inf_streetAddress;
        city = inf_city;
        state = inf_state;
        zipcode = inf_zipcode;
    }

    /**
     *
     * @param city to set city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @param state to set state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @param streetAddress to set streetAddress
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /**
     *
     * @param zipcode to set zipcode
     */
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    /**
     *
     * @return the zipcode
     */
    public int getZipcode() {
        return zipcode;
    }

    /**
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @return the streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     *
     * @return the basic information about a man's MailAddress
     */
    @Override
    public String toString()
    {
        return streetAddress + "," + city + "," + state + "," + zipcode;
    }

}
