import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a command (type help for details)");
        String command;
        Board b = new Board();
        while (!(command = in.nextLine()).equals("exit")){

            if (command.equals("help")){
                System.out.println("Possible commands are as follows:\n" +
                        "create location [fast][flexible]: Creates a new piece.\n" +
                        "move location direction [spaces]: Moves a piece.\n" +
                        "print: Displays the board.\n" +
                        "help: Displays help.\n" +
                        "exit: Exits the program.");
            }
            else if (command.equals("print")){
                b.Display();
            }
            else if (command.split(" ")[0].equals("create")){
                String[] temp = command.split(" ");
                if (temp.length < 3)
                    return;
                int position[] = new int[2];
                position[0] = Integer.parseInt(temp[1]);
                position[1] = Integer.parseInt(temp[2]);
                System.out.println("Input a name for the new piece:");
                String name = in.nextLine();
                System.out.println("Input a colour for the new piece:");
                String colour = in.nextLine();
                if (temp.length == 3){
                    SlowPiece sp = new SlowPiece(name,colour,position);
                    b.Add(sp);
                }
                else if (temp.length == 4){
                    if (temp[3].equals("fast")){
                        FastPiece fp = new FastPiece(name,colour,position);
                        b.Add(fp);
                    }
                    if (temp[3].equals("flexible")){
                        SlowFlexible sf = new SlowFlexible(name,colour,position);
                        b.Add(sf);
                    }
                }
                else if (temp.length == 5 && temp[3].equals("fast") && temp[4].equals("flexible")){
                    FastFlexible ff = new FastFlexible(name,colour,position);
                    b.Add(ff);
                }
                else {
                    System.out.println("failed create");
                }
            }
            else if (command.split(" ")[0].equals("move")){
                String[] temp = command.split(" ");
                if (temp.length < 3){
                    return;
                }
                int xpos = Integer.parseInt(temp[1]);
                int ypos = Integer.parseInt(temp[2]);
                if (temp.length == 3){
                    System.out.println("Error, there is no parameter direction");
                }
                else if (temp.length == 4){
                    b.move(xpos,ypos,temp[3],1);
                }
                else if (temp.length == 5){
                    int n = Integer.parseInt(temp[4]);
                    b.move(xpos,ypos,temp[3],n);
                }
            }
            System.out.println("Enter a command (type help for details)");
        }
        System.out.println("Done");
    }

}
