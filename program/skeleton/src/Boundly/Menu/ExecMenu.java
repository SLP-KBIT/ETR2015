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
        this.selectedMode = selectedMode;
    }

    public void exec()
    {
        System.out.println("exec mode: " + selectedMode.getClass());
        this.selectedMode.exec();
    }
}
