import java.util.ArrayList;

public class PrintQueue{
    private GenericQueue<Job> genericQueue;
    public PrintQueue(){
        genericQueue = new GenericQueue<>();
    }

    /**
     * add Object Job to the arrayList
     * @param owner is the owner of the Object Job
     * @param jobID is the jobID of the Object Job
     */
    public void lpr(String owner,int jobID){
        genericQueue.enqueue(new Job(owner,jobID));
    }

    /**
     * print all element in the arrayList
     */
    public void lpq(){
        while (!genericQueue.isEmpty()){
            Job temp = genericQueue.dequeue();
            System.out.println("Owner: "+temp.getOwner()+", JobID: "+temp.getJobID());
        }
    }

    /**
     * remove the element which its jobID is given, if not exist, print "No such element"
     * @param jobID
     */
    public void lprm(int jobID){
        int tempID = -1;
        String tempOwner = "";
        int count = 0;
        while (count < genericQueue.size()){
            Job temp = genericQueue.next();
            if (temp.getJobID() == jobID){
                tempID = count;
                tempOwner = temp.getOwner();
                break;
            }
            count++;
        }
        if (tempID == -1){
            System.out.println("No such element");
            return;
        }
        genericQueue.remove(new Job(tempOwner,tempID));

    }

    /**
     * remove all element that its owner is given
     * @param owner
     */
    public void lprmAll(String owner){

        ArrayList<Integer> tempID = new ArrayList<>();
        int count = 0;
        while (count < genericQueue.size()){
            Job temp = genericQueue.next();
            String tempOwner = temp.getOwner();
            if (tempOwner.equals(owner)){
                tempID.add(temp.getJobID());
            }
        }
        for (int i = 0;i < tempID.size();i++){
            genericQueue.remove(new Job(owner,tempID.get(i)));
        }
    }


}
