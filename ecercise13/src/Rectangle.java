public class Rectangle {
    private double xpos;
    private double ypos;
    private double width;
    private double height;

    public Rectangle(double xpos,double ypos,double width,double height){
        this.xpos = xpos;
        this.ypos = ypos;
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getXpos() {
        return xpos;
    }

    public double getYpos() {
        return ypos;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setXpos(double xpos) {
        this.xpos = xpos;
    }

    public void setYpos(double ypos) {
        this.ypos = ypos;
    }

    public boolean contains(double px,double py){
        return px > xpos && px < xpos+width && py > ypos &&  py < ypos+height;
    }

    public boolean touches(double px,double py){
        if (((px == xpos || px == xpos+width) && py >= ypos && py <= ypos+height)
            || ((py == ypos || py ==ypos+height) && px >= ypos && px <= xpos+width))
            return true;
        return false;
    }

    public boolean contains(Rectangle r){
        //if overlap ,return false
        if (xpos == r.xpos && ypos == r.ypos && width == r.width && height == r.height)
            return false;
        return (xpos<r.xpos) && (ypos < r.ypos) &&//top-left point
                ((xpos+width)>(r.xpos+r.width)) && (ypos<r.ypos) &&//top-right point
                (xpos<r.xpos) && ((ypos+height)>(r.ypos+r.height)) &&//bottom-left point
                ((xpos+width)>(r.xpos+r.width)) && ((ypos+height)>(r.ypos+r.height));//bottom-right point
    }

    public boolean touches(Rectangle r){
        //if overlap ,return false
        if (xpos == r.xpos && ypos == r.ypos && width == r.width && height == r.height)
            return false;
        if (xpos==r.xpos||xpos==r.xpos+r.width||xpos+width==r.xpos+r.width||xpos+width==r.xpos)
            if (ypos <= r.ypos+r.height && ypos+height >= r.ypos)
                return true;
        if (ypos==r.ypos||ypos==r.ypos+r.height||ypos+height==r.ypos||ypos+height==r.ypos+r.height)
            if (xpos <= r.xpos+r.width && xpos+width >= r.xpos)
                return true;
        return false;
    }
}
