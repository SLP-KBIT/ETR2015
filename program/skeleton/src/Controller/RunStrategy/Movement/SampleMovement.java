package Controller.RunStrategy.Movement;

import Controller.Runner;
import Entity.EV3.EV3;
import Entity.EV3.Devise.InputDevise.Sensor.LightSensor;

public class SampleMovement extends Movement
{
  public SampleMovement() {}

  // threshold : 閾値
  public int calcTreshold()
  {
    EV3 ev3 = Runner.getEV3();
    LightSensor light = ev3.getLight();
    light.getValue();
    System.out.println("calclate treshold by " + this.getClass());
    return 5;  // 適当な値
  }

  public void execRun(int turn, int speed)
  {
    System.out.println("execRun");
    EV3 ev3 = Runner.getEV3();

  }
}