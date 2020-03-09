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
 * Description : This program has four attributes to form a mail address and a method
 *              to return the four attributes as a string
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
     * @return the basic information about a man's MailAddress
     */
    @Override
    public String toString()
    {
        return streetAddress + "," + city + "," + state + "," + zipcode;
    }

}
