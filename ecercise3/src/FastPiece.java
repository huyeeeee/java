public class FastPiece extends Piece {
    public FastPiece(String name,String colour,int[] position){
        super(name,colour,position);
    }

    /**
     * move n step left or right
     * @param direction can only be right or left
     * @param n is the distance that should be moved
     */
    public void move(String direction,int n){
        if (direction.equals("right")){
            if (super.getPosition()[1] + n <= 8){
                int[] temp = super.getPosition();
                temp[1] += n;
                super.setPosition(temp);
            }
        }
        else if (direction.equals("left")){
            if (super.getPosition()[1] - n >= 0){
                int[] temp = super.getPosition();
                temp[1] -= n;
                super.setPosition(temp);
            }
        }
        else {
            System.out.println("illegal command");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"F";
    }
}
