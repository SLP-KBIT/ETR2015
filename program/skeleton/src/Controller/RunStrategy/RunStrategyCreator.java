package Controller.RunStrategy;

import Controller.RunRecoder.Area;
import Controller.RunRecoder.RunRecoder;

public class RunStrategyCreator
{
  public static RunStrategy create()
  {
    RunRecoder recoder = new RunRecoder();
    Area area = recoder.getArea();
    System.out.println("create strategy ");
    switch ( area )
    {
      case No1 :
        return new SampleStrategy();
      default :
        return null;
    }
  }
}
