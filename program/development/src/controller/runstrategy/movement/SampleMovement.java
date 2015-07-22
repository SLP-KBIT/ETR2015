package controller.runstrategy.movement;

import controller.Runner;
import entity.EV3;

public class SampleMovement extends Movement
{
  public SampleMovement() {}

  // threshold : 閾値
  public int calcTreshold()
  {
    EV3 ev3 = Runner.getEV3();
    //LightSensor light = ev3.getLight();
    //light.getValue();
    System.out.println("calclate treshold by " + this.getClass());
    return 5;  // 適当な値
  }

  public void execRun(int turn, int speed)
  {
    System.out.println("execRun");
    EV3 ev3 = Runner.getEV3();
  }
}