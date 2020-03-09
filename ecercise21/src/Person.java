public class Person {
    protected String name;
    protected Height height;
    protected int weight;
    protected String hometown;
    protected String highSchool;

    public Person(){}
    public Person(String name,Height height,int weight,String hometown,String highSchool){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public String getHeight() {
        return height.toString();
    }

    public String getName() {
        return name;
    }

    public String getHometown() {
        return hometown;
    }

    public String getHighSchool() {
        return highSchool;
    }

    @Override
    public String toString() {
        return getName() + getHeight() + getWeight() + getHometown() + getHighSchool();
    }
}

