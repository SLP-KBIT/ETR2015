package Controller.RunStrategy.RunStyle;

import Controller.Runner;
import Entity.EV3.EV3;

public class SampleRunStyle extends RunStyle
{
  public SampleRunStyle()
  {
    super();
  }

  public void transform()
  {
    EV3 ev3 = Runner.getEV3();
    System.out.println("transform robot by " + this.getClass());
  }
}