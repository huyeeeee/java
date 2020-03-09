package chapter4;

public class AbstractDemo{
    public static void main(String[] args){
        A_1 a_1 = new B_1();
        a_1.print();
    }
}

class B_1 extends A_1{
    public void print(){
        System.out.println("Hello World");
    }
}
abstract class A_1{
    public abstract void print();
}
