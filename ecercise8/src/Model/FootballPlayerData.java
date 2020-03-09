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
 * Description : this program defines a class that has an attribute : players used to store FootballPlayer
 *              and five methods
 */


import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class FootballPlayerData implements TableData
{
    private ArrayList<FootballPlayer> players;
    private ArrayList<FootballPlayer> players1;
    //this attribute will be used to store the final data

    public FootballPlayerData()
    {

        players = new ArrayList<>();
        players1 = new ArrayList<>();
        loadTable();
    }

    /**
     * this function is given to read data in the XML file
     */
    public void ReadPlayersFromXML()
    {
        try
        {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null)
            {
                try
                {

                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp);

                } catch (ArrayIndexOutOfBoundsException theend)
                {
                    //System.out.println("end of file");
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx) {xx.printStackTrace();}
    }

    /**
     *
     * @param players1 to set players1
     */
    public void setPlayers1(ArrayList<FootballPlayer> players1) {
        this.players1 = players1;
    }

    /**
     *
     * @param players to set players
     */
    public void setPlayers(ArrayList<FootballPlayer> players) {
        this.players = players;
    }

    /**
     *
     * @return the players
     */
    public ArrayList<FootballPlayer> getPlayers() {
        return players;
    }

    /**
     *
     * @return the players
     */
    public ArrayList<FootballPlayer> getPlayers1() {
        return players1;
    }

    /**
     *
     * @return the whole data stored in ArrayList player
     */
    @Override
    public ArrayList getTable() {
        return getPlayers1();
    }

    /**
     *
     * @param firstLine is the start line
     * @param lastLine is the end line
     * @return the attributes from firstLine to lastLine
     */
    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> temp = new ArrayList<>();
        for (int i = firstLine;i <= lastLine;i++)
            temp.add(getLine(i));
        return temp;
    }

    /**
     *
     * @return the names of all attributes as an ArrayList of Strings.
     */
    @Override
    public ArrayList<String> getHeaders()    {
        return getPlayers1().get(0).getAttributeNames();
    }

    /**
     *
     * @param line is the location where (n-1)-th footballPlayer locates
     * @return the (n-1)-th footballPlayer's information
     */
    @Override
    public ArrayList<String> getLine(int line) {
        return getPlayers1().get(line).getAttributes();
    }

    /**
     * By using ReadPLayersFromXML method , the whole players' data is stored in attribute players,
     * but if you directly read the attribute players , you will get null data . So in this method,
     * in a for loop , renew the football object one by one by using the constructor with augments.
     * And the augments in the constructor are seven temporary attributes which are reread using
     * attribute player
     *
     */
    @Override
    public void loadTable() {
        ReadPlayersFromXML();
        for (int i = 0;i < getPlayers().size(); i++){
            int number1 = getPlayers().get(i).getNumber();
            int weight1 = getPlayers().get(i).getWeight();
            Height height1 = getPlayers().get(i).height;
            String hometown1 = getPlayers().get(i).getHometown();
            String highSchool1 = getPlayers().get(i).getHighSchool();
            String position1 = getPlayers().get(i).getPosition();
            String name1 = getPlayers().get(i).getName();
            FootballPlayer fp1 = new FootballPlayer(name1,height1,weight1,hometown1,highSchool1,number1,position1);
            players1.add(fp1);
        }
    }
}
