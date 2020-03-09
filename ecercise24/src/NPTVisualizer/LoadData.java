package NPTVisualizer;
/**
 * this program shows how to process data from a text file
 * Method readFile() is the main part in class LoadData,
 * its function is that reload the file and split the string data into
 * four different ArrayList,and they will be used in class GraphicInterface
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LoadData {
    private ArrayList<Integer> timeStamp = new ArrayList<>();
    private Set<String> sourceIPAddress = new HashSet<>();
    private ArrayList<String> saddr = new ArrayList<>();
    private Set<String> destinationIPAddress = new HashSet<>();
    private ArrayList<String> daddr = new ArrayList<>();
    private ArrayList<Integer> iPPacketSize = new ArrayList<>();
    private Set<Integer> timeset = new HashSet<>();
    private ArrayList<Integer> sum = new ArrayList<>();
    private int sign = 0;

    /**
     *
     * @return the arrayList sum
     */
    public ArrayList<Integer> getSum() {
        return sum;
    }

    /**
     *
     * @return the Set getTimeSet
     */
    public Set<Integer> getTimeset() {
        return timeset;
    }

    /**
     *
     * @return the set sourceIPAddress
     */
    public Set<String> getSourceIPAddress() {
        return sourceIPAddress;
    }

    /**
     *
     * @return the set DestinationIPAddress
     */
    public Set<String> getDestinationIPAddress() {
        return destinationIPAddress;
    }

    /**
     *
     * @return the ArrayList iPPacketSize
     */
    public ArrayList<Integer> getiPPacketSize() {
        return iPPacketSize;
    }

    /**
     *
     * @return the ArrayList timeStamp
     */
    public ArrayList<Integer> getTimeStamp() {
        return timeStamp;
    }

    /**
     *
     * @return the ArrayList daddr
     */
    public ArrayList<String> getDaddr() {
        return daddr;
    }

    /**
     *
     * @return the ArrayList saddr
     */
    public ArrayList<String> getSaddr() {
        return saddr;
    }

    /**
     *
     * @param filePath is the FilePath that store the information of the data
     * @throws IOException in case of the IOException error
     */
    public void readFile(String filePath) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String str = "";
        while ((str = bufferedReader.readLine()) != null){
            String[] strings = str.split("\t");
            if ((strings.length >= 8) && (strings[1] != " ") && (strings[2] != " ") && (strings[4] != " ") && (strings[7] != " ")){
                timeStamp.add(Integer.parseInt(strings[1].trim().split("\\.")[0]));
                timeset.add(Integer.parseInt(strings[1].trim().split("\\.")[0]));
                sourceIPAddress.add(strings[2]);
                saddr.add(strings[2]);
                daddr.add(strings[4]);
                destinationIPAddress.add(strings[4]);
                iPPacketSize.add(Integer.parseInt(strings[7]));
            }
        }
        sign = 1;
    }

    /**
     *
     * @return the sign
     */
    public int getSign() {
        return sign;
    }

    /**
     *
     * @param sign to set sign
     */
    public void setSign(int sign) {
        this.sign = sign;
    }
}
