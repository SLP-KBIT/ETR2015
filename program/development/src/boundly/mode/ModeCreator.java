package boundly.mode;

public class ModeCreator
{
  public static Mode create(String modeName)
  {
    Mode mode = null;
    switch ( modeName )
    {
      case "Run" :
        mode = new RunMode();
        break;
      case "Debug" :
        mode = new DebugMode();
        break;
      case "Calbrate" :
        mode = new CalbMode();
        break;
      default :
        break;
    }
    return mode;
  }
}