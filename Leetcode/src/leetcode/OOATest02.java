package leetcode;

public class OOATest02 {
    public static void main(String[] args){
        Son son = new Son();
        son.print();

    }
}

class Father{
    public Father(){
        System.out.println("Father's calling");
    }
    public void print(){
        System.out.println("Father");
    }
}

class Son extends Father{
    public Son(){
        super();
        System.out.println("Son's calling");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Son");
    }
}
