public class Job {
    private String owner;
    private int jobID;

    /**
     * constructor to initialize the object
     * @param o
     * @param j
     */
    public Job(String o,int j){
        owner = o;
        jobID = j;
    }

    public String getOwner() {
        return owner;
    }

    public int getJobID() {
        return jobID;
    }
}
