public class Height {
    private int feet;
    private int inches;


    public Height(){}
    public Height(int feet,int inches){
        this.feet = feet;
        this.inches = inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public int getFeet() {
        return feet;
    }

    @Override
    public String toString() {
        return getFeet() + "'" + getInches() + "\"";
    }
}
