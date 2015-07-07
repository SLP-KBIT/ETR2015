package Boundly.Menu;

import Boundly.Mode.*;

public class ExecMenu extends Menu
{
    private Mode selectedMode;
    public ExecMenu()
    {
        super();
    }

    public ExecMenu(Mode selectedMode)
    {
        if ( selectedMode != null )
        {
            this.selectedMode = selectedMode;
        }
        
    }

    public void exec()
    {
        try
        {
            System.out.println("execute mode of " + selectedMode.getClass());
            this.selectedMode.exec();
        }
        catch (NullPointerException e)
        {
            System.out.println("failure excute : " + e.toString());
        }
    }
}
