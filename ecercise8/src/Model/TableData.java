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
 * Description : this program defines a interface that has five methods
 */

import java.util.ArrayList;

public interface TableData
{

    public void loadTable();

    public ArrayList getTable();

    public ArrayList<String> getHeaders();

    public ArrayList<String> getLine(int line);

    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine);

}
