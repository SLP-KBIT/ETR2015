package boundly.mode;

public class ModeCreator
{
  public static Mode create(String modeName)
  {
    Mode mode = null;
    switch(modeName) {
      case "Run" :
        mode = new RunMode();
      case "Debug" :
        mode = new DebugMode();
      case "Calbrate" :
        mode = new CalbMode();
    }
    return mode;
  }
}
