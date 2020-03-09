
public class Circle {
    private double xpos;
    private double ypos;
    private double radius;
    public Circle(double xpos,double ypos,double radius){
        this.xpos = xpos;
        this.ypos = ypos;
        this.radius = radius;
    }

    public double getYpos() {
        return ypos;
    }

    public double getXpos() {
        return xpos;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(double xpos,double ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return Math.PI * radius * 2;
    }

    public boolean contains(double x,double y){
        return  (Math.pow(x-xpos,2)+Math.pow(y-ypos,2)) < radius;
    }

    public boolean touches(double x,double y){
        return (Math.pow(x-xpos,2)+Math.pow(y-ypos,2)) == Math.pow(radius,2);
    }
    public boolean contains(Circle c){
        //if overlap ,return false
        if (xpos == c.xpos && ypos == c.ypos && radius == c.radius)
            return false;
        else if (radius <= c.radius)
            return false;
        else {
            return (Math.sqrt(Math.pow(xpos-c.xpos,2)+Math.pow(ypos-c.ypos,2))+c.radius < radius);
        }
    }
    public boolean touches(Circle c){
        //if overlap ,return false
        if (xpos == c.xpos && ypos == c.ypos && radius == c.radius)
            return false;
        return (Math.pow(xpos-c.xpos,2)+Math.pow(ypos-c.ypos,2) == Math.pow(radius-c.radius,2)) ||
                (Math.pow(xpos-c.xpos,2)+Math.pow(ypos-c.ypos,2)) == Math.pow(radius+c.radius,2);
    }

}
