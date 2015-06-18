package controller.runstrategy.style;

import controller.Runner;
import entity.EV3;
import entity.device.motor.TailMotor;

public class SampleStyle extends Style
{
  public SampleStyle()
  {
    super();
  }

  public void transform()
  {
    EV3 ev3 = Runner.getEV3();
    TailMotor tail = ev3.getTailMotor();
    tail.setLotate(75);
  }
}