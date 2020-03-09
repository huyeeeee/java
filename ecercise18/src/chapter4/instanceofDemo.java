package chapter4;

public class instanceofDemo {
    public static void main(String[] args){
        A a = new B();
        System.out.println(a instanceof B);
    }
}
class A{
    public void fun(){
        System.out.println("A");
    }
}

class B extends A{
    public void fun1(){
        System.out.println("B");
    }
}
