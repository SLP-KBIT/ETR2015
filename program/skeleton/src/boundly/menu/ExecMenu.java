package boundly.menu;

import boundly.mode.Mode;

public class ExecMenu extends Menu
{
    public Mode selectedMode;
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
