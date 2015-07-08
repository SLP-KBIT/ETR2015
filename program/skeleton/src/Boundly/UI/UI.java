package Boundly.UI;

import Boundly.Menu.ExecMenu;
import Boundly.Menu.SelectMenu;
import Boundly.Mode.Mode;

public class UI {
  private static SelectMenu selectMenu;
  private static ExecMenu execMenu;

  public static void main(String[] args) {
    selectMenu = new SelectMenu();
    Mode mode = selectMenu.select();
    execMenu = new ExecMenu(mode);
    execMenu.exec();
  }
}
