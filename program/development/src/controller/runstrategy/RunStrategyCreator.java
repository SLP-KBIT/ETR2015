package controller.runstrategy;

import controller.runrecoder.Area;
import controller.runrecoder.RunRecoder;

public class RunStrategyCreator
{
  public static RunStrategy create()
  {
    RunRecoder recoder = new RunRecoder();
    Area area = recoder.getArea();
    switch ( area )
    {
      case No1 :
        return new SampleStrategy();
      default :
        return null;
    }
  }
}
