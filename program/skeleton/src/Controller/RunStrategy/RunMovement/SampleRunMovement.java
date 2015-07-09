package Controller.RunStrategy.RunMovement;

import Controller.Runner;
import Entity.EV3.EV3;

public class SampleRunMovement extends RunMovement
{
  public SampleRunMovement() {}

  // threshold : 閾値
  public int calcTreshold()
  {
    EV3 ev3 = Runner.getEV3();
    ev3.lightSensor.getValue();
    System.out.println("calclate treshold by " + this.getClass());
    return 5;  // 適当な値
  }

  public void execRun(int turn, int speed)
  {
    System.out.println("execRun");
    EV3 ev3 = Runner.getEV3();
    ev3.leftMotor.setSpeed(speed - turn);
    ev3.rightMotor.setSpeed(speed + turn);
  }
}