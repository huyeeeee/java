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
 * Description : this program defines a interface that has four methods
 */

import java.util.ArrayList;

public interface TableMember {
    String getAttribute(int n);

    ArrayList<String> getAttributes();

    String getAttributeName(int n);

    ArrayList<String> getAttributeNames();
}