package IST_242.A03B_Starter.src.Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class FootballPlayerData implements TableData
{

    private ArrayList<FootballPlayer> players;

    public FootballPlayerData()
    {
        players = new ArrayList<>();
        ReadPlayersFromXML();
    }

    public void ReadPlayersFromXML()
    {
        try
        {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("C:\\Users\\胡也\\IdeaProjects\\Demo01\\src\\IST_242\\A03B_Starter\\FootballPlayerTable.xml")));
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

    @Override
    public ArrayList getTable() {
        return getPlayers();
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
        for (int i = firstLine;i <= lastLine;i++)
            temp.add(getLine(i));
        return temp;
    }

    @Override
    public ArrayList<String> getHeaders() {
        return players.get(0).getAttributeNames();
    }

    @Override
    public ArrayList<String> getLine(int line) {
        return players.get(line).getAttributes();
    }

    @Override
    public void loadTable() {

    }

    public static void main(String[] args){
        FootballPlayerData fp = new FootballPlayerData();
        System.out.println(fp.getPlayers());
    }
}
