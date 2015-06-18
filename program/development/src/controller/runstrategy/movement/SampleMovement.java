package controller.runstrategy.movement;

import controller.Runner;
import controller.runstrategy.style.SampleStyle;
import controller.runstrategy.style.Style;
import entitiy.device.sensor.GyroSensor;
import entity.EV3;
import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.internal.ev3.EV3LED;
import lejos.robotics.SampleProvider;
import balancer.Balancer;

public class SampleMovement extends Movement
{
  private Style style;
  
  public SampleMovement()
  {
    style = new SampleStyle();
  }

  // threshold : 閾値
  public int calcTreshold()
  {
    EV3 ev3 = Runner.getEV3();
    return 5;  // 適当な値
  }

  public void execRun(int turn, int speed)
  {
    EV3 ev3 = Runner.getEV3();
    ev3.init();
    GyroSensor gyro = ev3.getGyroSensor();
    style.transform();
    while ( ! Button.ESCAPE.isDown() )
    {
      ev3.setForword(50, 0);
      LCD.clearDisplay();
      LCD.drawInt((int)gyro.getSampleData(), 0, 0);
    }
  }
}