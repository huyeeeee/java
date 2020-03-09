public class SlowPiece extends Piece {
    public SlowPiece(String name,String colour,int[] position){
        super(name,colour,position);
    }

    /**
     * this method is used to move the piece right or left one step
     * @param direction can only be right or left
     */
    public void move(String direction){
        if (direction.equals("right")){
            if (super.getPosition()[1] < 8){
                int[] temp = super.getPosition();
                temp[1] ++;
                super.setPosition(temp);
            }
        }
        else if (direction.equals("left")){
            if (super.getPosition()[1] > 0){
                int[] temp = super.getPosition();
                temp[1] --;
                super.setPosition(temp);
            }
        }
        else {
            System.out.println("illegal command");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"S";
    }
}
