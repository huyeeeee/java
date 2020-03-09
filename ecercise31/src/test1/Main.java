package test1;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        FootballPlayer fp;
        XMLDecoder decoder;
        decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
//        fp = new FootballPlayer();

        decoder.close();
    }
}
