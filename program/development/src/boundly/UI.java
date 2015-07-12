package boundly;

import boundly.menu.ExecMenu;
import boundly.menu.SelectMenu;
import boundly.mode.Mode;

public class UI
{
  private static SelectMenu _selectMenu;
  private static ExecMenu _execMenu;

  public static void main(String[] args)
  {
    _selectMenu = new SelectMenu();
    Mode mode = _selectMenu.select();
    _execMenu = new ExecMenu(mode);
    _execMenu.exec();
  }
}
