import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SlotMachine {
    private int currentMoney;// this attribute is the current money in the game
    private int getMoney;// this attribute is the money that player get after one game
    private int leftMoney;// this attribute is the money in the Machine after one game

    /**
     *
     * @param currentMoney to set currentMoney
     */
    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }

    /**
     * use this method to get the Money from the file "SlotMachine.txt"
     * @return the money stored in the text file
     */
    public int getStartMoney(){
        String str1 = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("SlotMachineMoney.txt"));

            str1 = bufferedReader.readLine();
            bufferedReader.close();
        }catch (FileNotFoundException e1){
            e1.printStackTrace();
        }catch (IOException e2){
            e2.printStackTrace();
        }
        return Integer.parseInt(str1);
    }

    /**
     * use this method to play the game,
     * attention : if the result has two couple data , equals them as three words are same
     * @param bet is the money that player insert in the game
     */
    public void PlaySlotMachine(int bet){
        System.out.println("game is starting...");
        leftMoney = 0;
        setCurrentMoney(bet + getStartMoney());
        getMoney = bet;
        String[] list = new String[]{"Cherry","Lemon","Orange","Apple","Grape","Banana"};
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0;i < 4;i++){
            int chooseNumber = (int)(Math.random() * 6);//get four random numbers
            result.add(list[chooseNumber]);
        }
        System.out.println("the result is : " + result);
        result = new ArrayList<>(new HashSet<>(result));
        if (result.size() == 4)
            // means that there is no same words
            getMoney = 0;
        else if (result.size() == 3)
            // means there is two same words
            getMoney = bet * 2 < currentMoney ? bet * 2 : currentMoney;
        else if (result.size() == 2)
            // means that there is three same words
            getMoney = bet * 3 < currentMoney ? bet * 3 : currentMoney;
        else
            //means the four words are same
            getMoney = bet * 10 < currentMoney ? bet * 10 : currentMoney;
        System.out.println("the money you win is : " + (getMoney - bet));

        leftMoney = currentMoney - getMoney;
        System.out.println("the left money in Machine is : " + leftMoney);
    }

    /**
     * update the money , rewrite the money after each game
     */
    public void UpdateCurrentMoney(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter("SlotMachineMoney.txt"));
            bufferedWriter.write(String.valueOf(leftMoney));
            bufferedWriter.close();
        }catch (IOException e1){
            e1.printStackTrace();
        }
    }

    public static void main(String[] args){
        SlotMachine slotMachine = new SlotMachine();
        System.out.println("------------------GAME START-------------------");
        while (true){
            System.out.println("please input your bet:(int)");
            int bet = new Scanner(System.in).nextInt();
            if (slotMachine.getStartMoney() < 1000){
                System.out.println("money in machine is not enough!");
                System.out.println("------------------GAME END-------------------");
                break;
            }
            else {
                slotMachine.PlaySlotMachine(bet);
                slotMachine.UpdateCurrentMoney();
                System.out.print("Do you want to try again?");
                System.out.println("(print \"NO\" to end game , print any other word(s) to restart the game)");
                if (new Scanner(System.in).nextLine().equals("No")){
                    System.out.println("------------------GAME END-------------------");
                    break;
                }
            }
        }

    }
}
