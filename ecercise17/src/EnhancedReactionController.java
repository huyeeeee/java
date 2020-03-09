public class EnhancedReactionController implements Controller{
    private Gui gui;
    private Random rng;

    final private String insertCoin = "Insert Coin";
    final private String go = "Press GO";
    final private String wait = "Waiting";

    private int countPressGoStop = 0;

    private long temp = 0;
    private long tempWaitingTime = 200;
    private long finalTime = 0;
    private long randomTime = 0;
    private long waitTime = 0;
    private long wholeTime = 0;
    private long showingTime = 0;
    private boolean isCheating = false;
    private boolean isStartGame = false;
    private boolean isPressGoStop = false;
    private boolean isPressInsert = false;


    public EnhancedReactionController(){

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
            if (isPressInsert && countPressGoStop < 10){
                if (isPressGoStop){
                    if (countPressGoStop % 3 == 1){
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
                            }
                        }
                    }
                    else if (countPressGoStop % 3 == 2){
                        showingTime ++;

                        if (isCheating || showingTime > 200){
                            gui.setDisplay(insertCoin);
                            countPressGoStop++;
                        }
                    }
                    if (countPressGoStop % 3 == 0 && countPressGoStop > 0){
                        if (countPressGoStop > 6){
                            if (temp == 0)
                                wholeTime += finalTime;
                            if (temp < tempWaitingTime){
                                gui.setDisplay("average time: "
                                        + String.format("%.2f",wholeTime / 300.0)
                                        + "s");
                            }
                            else
                                countPressGoStop++;
                            temp++;

                        }
                        else{
                            wholeTime += finalTime;
                            randomTime = rng.getRandom(100,250);
                            waitTime = 0;
                            showingTime = 0;
                            finalTime = 0;
                            gui.setDisplay(wait);
                            countPressGoStop++;
                        }

                    }
                    System.out.println(countPressGoStop);
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
        if (countPressGoStop % 3 == 1){
            randomTime = rng.getRandom(100,250);
            waitTime = 0;
            showingTime = 0;
            finalTime = 0;
        }
        if (countPressGoStop % 3 == 2 && waitTime < randomTime){
            isCheating = true;
        }
    }

    @Override
    public void coinInserted() {
        isPressInsert = true;
        isCheating = false;
        isStartGame = true;
        isPressGoStop = false;
        randomTime = 0;
        finalTime = 0;
        waitTime = 0;
        showingTime = 0;
        countPressGoStop = 0;
    }
}
