public class StudentRecord {
    private String firstName;
    private String lastName;
    private int bannerID;

    /**
     * constructor to initialize the data
     * @param firstName
     * @param lastName
     * @param bannerID
     */
    public StudentRecord(String firstName,String lastName,int bannerID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bannerID = bannerID;
    }

    // getter and setter methods
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBannerID() {
        return bannerID;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBannerID(int bannerID) {
        this.bannerID = bannerID;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName+" "+bannerID;
    }
}
