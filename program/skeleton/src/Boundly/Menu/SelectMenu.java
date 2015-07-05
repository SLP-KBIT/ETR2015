package Boundly.Menu;

import Boundly.Mode.*;

public class SelectMenu extends Menu
{
    private String modeName;
    public SelectMenu()
    {
        super();
    }
    
    public Mode select()
    {
        this.modeName = "Run"; // this.modeName = this.selectModeName();
        Mode mode = ModeCreator.create(this.modeName);
        return mode;
    }
    private static String selectModeName()
    {
        //TODO: 入力に対してモードネームを返す
        return "";
    }
}
