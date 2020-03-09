public class SimpleReactionController implements Controller{
    private Gui gui;
    private Random rng;

    final private String insertCoin = "Insert Coin";
    final private String go = "Press GO";
    final private String wait = "Waiting";

    private int countPressGoStop = 0;

    private long finalTime = 0;
    private long randomTime = 0;
    private long waitTime = 0;
    private long showingTime = 0;
    private boolean isTooSlow = false;
    private boolean isCheating = false;
    private boolean isStartGame = false;
    private boolean isPressGoStop = false;
    private boolean isPressInsert = false;


    public SimpleReactionController(){

    }
    @Override
    public void init() {
        gui.setDisplay(insertCoin);
    }


    @Override
    public void connect(Gui gui, Random rng) {
        this.gui = gui;
        this.rng = rng;
    }

    @Override
    public void tick() {
        if (isStartGame){
            if (isPressInsert){
                if (isPressGoStop){
                    if (countPressGoStop == 1){
                        if (waitTime < randomTime){
                            if (isCheating){
                                isStartGame = false;
                            }
                            gui.setDisplay(wait);
                            waitTime ++;
                        }
                        else {
                            finalTime ++;
                            gui.setDisplay(String.format("%.2f",finalTime/100.0) + "s");
                            if (finalTime >= 200){
                                isTooSlow = true;
                                countPressGoStop++;
                            }
                        }
                    }
                    else if (countPressGoStop == 2){
                        showingTime ++;

                        if (isCheating || showingTime > 200)
                            gui.setDisplay(insertCoin);
                    }
                    if (countPressGoStop == 3){
                        gui.setDisplay(insertCoin);
                    }
                }
                else {
                    gui.setDisplay(go);
                }
            }
            else {
                gui.setDisplay(insertCoin);
            }
        }
        else {
            gui.setDisplay(insertCoin);
        }
    }

    @Override
    public void goStopPressed() {
        countPressGoStop ++;
        isPressGoStop= true;
        if (countPressGoStop == 1){
            randomTime = rng.getRandom(100,250);
        }
        if (countPressGoStop == 2 && waitTime < randomTime){
            isCheating = true;
        }
    }

    @Override
    public void coinInserted() {
        isPressInsert = true;
        isCheating = false;
        isTooSlow = false;
        isStartGame = true;
        isPressGoStop = false;
        randomTime = 0;
        finalTime = 0;
        waitTime = 0;
        showingTime = 0;
        countPressGoStop = 0;
    }
}
