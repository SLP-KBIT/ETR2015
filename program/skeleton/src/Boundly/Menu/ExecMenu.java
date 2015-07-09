package Boundly.Menu;

import Boundly.Mode.Mode;

public class ExecMenu extends Menu
{
  private Mode _selectedMode;

  public ExecMenu()
  {
    super();
  }

  public ExecMenu(Mode selectedMode)
  {
    if ( _selectedMode == null )
    {
      _selectedMode = selectedMode;
    }
  }

  public void exec()
  {
    try
    {
      System.out.println("execute mode of " + _selectedMode.getClass());
      _selectedMode.exec();
    }
    catch ( NullPointerException e )
    {
      System.out.println("failure excute : " + e.toString());
    }
  }
}
