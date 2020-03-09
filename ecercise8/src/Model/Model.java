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
 * Description : this program has the main method to defines the whole process
 */

import java.util.ArrayList;

public class Model
{

    public Model()
    {
        FootballPlayerData fpData = new FootballPlayerData();
        System.out.println("=============================================================");
        System.out.println(fpData.getHeaders().toString());
        System.out.println("=============================================================");
        System.out.println(fpData.getLine(50).toString());
        System.out.println("=============================================================");
        ArrayList<ArrayList<String>> lines = fpData.getLines(0, 4);
        for (int i = 0; i < lines.size(); i++)
        {
            System.out.println(lines.get(i).toString());
        }
        System.out.println("=============================================================");
    }
}
