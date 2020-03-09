public class FastFlexible extends FastPiece {
    public FastFlexible(String name,String colour,int[] position){
        super(name,colour,position);
    }

    /**
     * move n distance in four directions
     * @param direction can only be right, left, up or down
     * @param n is the distance that should be moved
     */
    @Override
    public void move(String direction, int n) {
        if (direction.equals("up")){
            if (super.getPosition()[0]-n >= 0){
                int[] temp = super.getPosition();
                temp[0] -= n;
                super.setPosition(temp);
            }
        }
        else if (direction.equals("down")){
            if (super.getPosition()[0] + n <= 8){
                int[] temp = super.getPosition();
                temp[0] += n;
                super.setPosition(temp);
            }
        }
        else super.move(direction, n);
    }

    @Override
    public String toString() {
        return super.toString()+"F";
    }
}
