public interface Gui
{
    //Connect gui to controller
    //(This method will be called before ANY other methods)
    public void connect(Controller controller);

    //Initialise the gui
    public void init();

    //Change the displayed text
    public void setDisplay(String s);
}
