public class Board {
    private Piece[][] board = new Piece[8][8];

    /**
     * the constructor is used to initialize the board
     */
    public Board(){
        for (int i = 0;i < 8;i++){
            for (int j = 0;j < 8;j++){
                board[i][j] = new Piece("","",new int[]{-1,-1});
            }
        }
    }

    /**
     * add a piece in the board, if the position in the board you want to add
     * is not null, then failed to add
     * @param piece is the element that should be added in the board
     */
    public void Add(Piece piece){
        int xpos = piece.getPosition()[0];
        int ypos = piece.getPosition()[1];
        if (board[xpos][ypos].getPosition()[0] == -1 &&  xpos < 9 && ypos < 9){
            board[xpos][ypos] = piece;
        }
        else {
            System.out.println("failed add");
        }
    }

    /**
     * display the current state of the board
     */
    public void Display(){
        for (int i = 0;i < 8;i++){
            for (int j = 0;j < 8;j++){
                if (board[i][j].toString().equals(""))
                    System.out.printf("%-20s","-");
                else System.out.printf("%-20s",board[i][j].toString());
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    /**
     * move
     * @param xpos is the x-axis position
     * @param ypos is the y-axis position
     * @param direction can be left, right, up, down
     * @param n is the distance should be moved
     */
    public void move(int xpos,int ypos,String direction,int n){
        // if the piece you want to move exist, then move
        if (board[xpos][ypos].getPosition()[0] != -1){
            if (direction.equals("left") || direction.equals("right")){
                if (n > 1){
                    ((FastPiece)board[xpos][ypos]).move(direction,n);
                }
                else {
                    ((SlowPiece)board[xpos][ypos]).move(direction);

                }
            }
            else if (direction.equals("up") || direction.equals("down")){
                if (n > 1){
                    ((FastFlexible)board[xpos][ypos]).move(direction,n);
                }
                else ((SlowFlexible)board[xpos][ypos]).move(direction);
            }
            int temp_x = board[xpos][ypos].getPosition()[0];
            int temp_y = board[xpos][ypos].getPosition()[1];
            board[temp_x][temp_y] = board[xpos][ypos];
            board[xpos][ypos] = new Piece("","",new int[]{-1,-1});
        }
        else {
            System.out.println("Error, no piece at("+xpos+","+ypos+")");
        }
    }
}
