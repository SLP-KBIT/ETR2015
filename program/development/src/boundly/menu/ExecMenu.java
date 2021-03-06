package boundly.menu;

import boundly.mode.Mode;

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
      _selectedMode.exec();
    }
    catch ( NullPointerException e )
    {
      System.out.println("failure excute : " + e.toString());
    }
  }
}