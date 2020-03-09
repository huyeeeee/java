package NPTVisualizer;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> time = new ArrayList<>();
        ArrayList<Integer> size = new ArrayList<>();
        ArrayList<String> temp;
        LoadData loadData = new LoadData();
        loadData.readFile("trace40.txt");
        System.out.println(loadData.getDaddr().size());
        temp = new ArrayList<>(loadData.getDestinationIPAddress());
        String text = temp.get(9);
        System.out.println(temp.size());
        int j = 0;
        for (int i = 0;i < loadData.getDaddr().size();i++) {
            if (text.trim().equals(loadData.getDaddr().get(i).trim())) {
                time.add(loadData.getTimeStamp().get(i));
                size.add(loadData.getiPPacketSize().get(i));
                System.out.println(j++);
            }
        }
//        time1 = time.stream().mapToDouble(Double::doubleValue).toArray();
//        size1 = size.stream().mapToDouble(Double::doubleValue).toArray();
        System.out.println(time + "\n" + size);


    }
}
