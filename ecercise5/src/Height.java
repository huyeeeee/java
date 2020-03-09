public class Height {
    private int feet;
    private int inch;

    //constructor
    public Height(int feet,int inch){
        this.feet = feet;
        this.inch = inch;
    }
    public Height(){
        feet = 0;
        inch= 0;
    }

    //setter and getter methods
    public int getFeet() {
        return feet;
    }

    public int getInch() {
        return inch;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    /**
     *display the height
     * @return
     */
    @Override
    public String toString() {
        return feet+"'"+inch;
    }
}
