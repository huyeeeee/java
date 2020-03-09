public class Store {
    private int stock = 200;
    private double price = 2.99;
    private double cash = 0.0;

    public Store(){

    }

    public void sell(int sellStock){
        stock -= sellStock;
        cash += price * sellStock;
    }

    public res
}
