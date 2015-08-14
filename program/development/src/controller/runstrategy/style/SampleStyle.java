package controller.runstrategy.style;

import controller.Runner;
import entity.EV3;

public class SampleStyle extends Style
{
  public SampleStyle()
  {
    super();
  }

  public void transform()
  {
    EV3 ev3 = Runner.getEV3();
    //System.out.println("transform robot by " + this.getClass());
  }
}