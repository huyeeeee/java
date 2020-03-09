package IST_242.A03B_Starter.src.Model;

import java.util.ArrayList;

public interface TableData
{

    public void loadTable();

    public ArrayList getTable();

    public ArrayList<String> getHeaders();

    public ArrayList<String> getLine(int line);

    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine);

}
