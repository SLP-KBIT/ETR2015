package boundly.menu;

import boundly.mode.Mode;
import boundly.mode.ModeCreator;

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
    Mode mode = ModeCreator.create(_modeName);
    return mode;
  }

  private static String selectModeName()
  {
    //TODO: 入力に対してモードネームを返す
    return "Run";
  }
}