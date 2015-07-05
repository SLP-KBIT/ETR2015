package boundly.menu;

import boundly.mode.Mode;
import boundly.mode.ModeCreator;

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
        return ModeCreator.create(this.modeName);
    }
    public static String selectModeName()
    {
        //TODO: 入力に対してモードネームを返す
        return "";
    }
}
