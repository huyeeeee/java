public class Point<T> {
    private T xpos;
    private T ypos;

    //constructor
    public Point(T xpos,T ypos){
        this.xpos = xpos;
        this.ypos = ypos;
    }

    //getter and setter methods
    public T getXpos() {
        return xpos;
    }

    public T getYpos() {
        return ypos;
    }

    public void setYpos(T ypos) {
        this.ypos = ypos;
    }

    public void setXpos(T xpos) {
        this.xpos = xpos;
    }

    @Override
    public String toString() {
        return "XPOS: "+xpos+"\tYPOS: "+ypos;
    }
}
