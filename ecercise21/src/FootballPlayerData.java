import java.util.ArrayList;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;


public class FootballPlayerData implements TableData{
    private ArrayList<FootballPlayer> players;

    public FootballPlayerData(){
        players = new ArrayList<>();
        ReadPlayersFromXML();
    }

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
        } catch (Exception xx)
        {
            xx.printStackTrace();
        }
    }

    public ArrayList<FootballPlayer> getPlayers() {
        return players;
    }

    @Override
    public void loadTable() {

    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
        for (int i = firstLine;i <= lastLine;i++)
            temp.add(getLine(i));
        return temp;
    }

    @Override
    public ArrayList<FootballPlayer> getTable() {
        return getPlayers();
    }

    @Override
    public ArrayList<String> getHeaders() {
        return players.get(0).getAttributeNames();
    }

    @Override
    public ArrayList<String> getLine(int line) {
        return players.get(line).getAttributes();
    }

    public static void main(String[] args){
        FootballPlayerData fp = new FootballPlayerData();
        System.out.println(fp.players);
    }
}
