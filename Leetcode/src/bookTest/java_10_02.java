package bookTest;

public class java_10_02 {
    public static void main(String[] args){
        Info<String> i = new Info<String>();
        i.setVar("111");
        fun(i);
    }

    public static void fun(Info<?> temp){
        System.out.println(temp);
    }
}
class Info<T>{
    private T var;
    public T getVar(){
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return this.var.toString();
    }
}