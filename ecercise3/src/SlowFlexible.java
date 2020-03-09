public class SlowFlexible extends SlowPiece {
    public SlowFlexible(String name,String colour,int[] position){
        super(name,colour,position);
    }

    /**
     * this method can be used to move in four directions
     * @param direction can only be one of these four directions
     *                 [right, left, up, down]
     */
    @Override
    public void move(String direction) {
        if (direction.equals("up")){
            if (super.getPosition()[0] > 0) {
                int[] temp = super.getPosition();
                temp[0]--;
                super.setPosition(temp);
            }
        }
        else if (direction.equals("down")){
            if (super.getPosition()[0] < 8){
                int[] temp = super.getPosition();
                temp[0]++;
                super.setPosition(temp);
            }
        }
        else {
            super.move(direction);
        }
    }

    @Override
    public String toString() {
        return super.toString()+"S";
    }
}
