public class Piece {
    private String name;
    private String colour;
    private int[] position;
    public Piece(String name,String colour,int[] position){
        this.name = name;
        this.colour = colour;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int[] getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return name+colour;
    }

}
