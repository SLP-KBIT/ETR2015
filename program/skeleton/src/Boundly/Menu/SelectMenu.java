package Boundly.Menu;

import Boundly.Mode.Mode;
import Boundly.Mode.ModeCreator;

public class SelectMenu extends Menu
{
  private String _modeName;

  public SelectMenu()
  {
    super();
  }

  public Mode select()
  {
    _modeName = SelectMenu.selectModeName();
    System.out.println("modename: " + _modeName);
    Mode mode = ModeCreator.create(_modeName);
    return mode;
  }

  private static String selectModeName()
  {
    //TODO: 入力に対してモードネームを返す
    return "Run";
  }
}
