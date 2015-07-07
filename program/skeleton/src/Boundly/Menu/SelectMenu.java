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
        this.modeName = SelectMenu.selectModeName();
        System.out.println("modename: " + modeName);
        Mode mode = ModeCreator.create(this.modeName);
        return mode;
    }
    private static String selectModeName()
    {
        //TODO: 入力に対してモードネームを返す
        return "Run";
    }
}
