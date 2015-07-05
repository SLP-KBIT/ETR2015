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
        System.out.println("execute mode of " + selectedMode.getClass());
        this.selectedMode.exec();
    }
}
