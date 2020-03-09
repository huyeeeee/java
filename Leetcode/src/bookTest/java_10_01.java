package bookTest;

public class java_10_01 {
    public static void main(String[] args){
        Point<Integer> p = new Point<>();
        p.setVar(30);
        System.out.println(p.getVar());
    }
}
class Point<T>{
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
