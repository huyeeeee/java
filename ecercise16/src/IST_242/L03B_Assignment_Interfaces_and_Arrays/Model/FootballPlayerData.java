package IST_242.L03B_Assignment_Interfaces_and_Arrays.Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class FootballPlayerData implements TableData
{

    private ArrayList<FootballPlayer> players;

    public FootballPlayerData()
    {
        players = new ArrayList<>();

    }

 
    public void ReadPlayersFromXML()
    {
        try
        {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp == null)
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
        } catch (Exception xx)
        {
            xx.printStackTrace();
        }
    }

    @Override
    public ArrayList getTable() {
        return null;
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        return null;
    }

    @Override
    public ArrayList<String> getHeaders() {
        return null;
    }

    @Override
    public ArrayList<String> getLine(int line) {
        return null;
    }

    @Override
    public void loadTable() {

    }
}
