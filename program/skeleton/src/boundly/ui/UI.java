package boundly.ui;

import boundly.menu.*;
import boundly.mode.*;

public class UI
{
    private static SelectMenu selectMenu;
    private static ExecMenu execMenu;

    public static void main(String[] args)
    {
        selectMenu = new SelectMenu();
        Mode mode = selectMenu.select();
        execMenu = new ExecMenu(mode);
        execMenu.exec();
    }
}
