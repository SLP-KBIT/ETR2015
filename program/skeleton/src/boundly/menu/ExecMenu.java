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
        this.selectedMode.exec();
    }
}
