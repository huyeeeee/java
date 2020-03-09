
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FootballPlayer extends Person implements TableMember{
    private int number;
    private String position;
    ArrayList<String> Attributes = new ArrayList<>();
    ArrayList<String> AttributeNames = new ArrayList<>();
    public FootballPlayer(){
        List list = Arrays.asList(name,height,weight,hometown
                ,highSchool,number,position);
        Attributes.addAll(list);
        AttributeNames.addAll(Arrays.asList("name","height","weight","hometown"
                ,"highSchool","number","position"));
    }
    public FootballPlayer(int number,String name,String position,Height height,
                          int weight,String hometown,String highSchool){
        super(name,height,weight,hometown,highSchool);
        this.number = number;
        this.position= position;

        AttributeNames.addAll(Arrays.asList("number","name","position","height",
                "weight","hometown","highSchool"));
        List list = Arrays.asList(name,height,weight,hometown
                ,highSchool,number,position);
        Attributes.addAll(list);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String getAttribute(int n) {
        return Attributes.get(n);
    }

    @Override
    public ArrayList<String> getAttributes() {
        return Attributes;
    }

    @Override
    public String getAttributeName(int n) {
        return AttributeNames.get(n);
    }

    @Override
    public ArrayList<String> getAttributeNames() {
        return AttributeNames;
    }

    @Override
    public String toString() {
        return getNumber() + getName() + getPosition() + getHeight() + getWeight()
                + getHometown() + getHighSchool();
    }
}
