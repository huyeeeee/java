package leetcode;

public class StringTest {
    public static void main(String[] args){
        Demo d1 = new Demo();
        d1.setTemp(50);
        d1.fun(d1);
        System.out.println(d1.getTemp());
    }
}
class Demo{
    private int temp = 30;

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void fun(Demo d1){
        d1.temp = 50;
    }
}