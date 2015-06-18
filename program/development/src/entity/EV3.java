package entity;

import balancer.Balancer;
import entitiy.device.sensor.GyroSensor;
import entity.device.motor.Direction;
import entity.device.motor.RunMotor;
import entity.device.motor.TailMotor;
import lejos.hardware.lcd.LCD;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class EV3
{
  // motor
  private static final RunMotor _leftMotor = new RunMotor('B');
  private static final RunMotor _rightMotor = new RunMotor('C');
  private static final TailMotor _tailMotor = new TailMotor();
  // encoder
  //private static final Encoder _leftEncoder = new Encoder('A');
  //private static final Encoder _rightEncoder = new Encoder('B');
  // sensor
  //private static final LightSensor _lightSensor = new LightSensor();
  private static final GyroSensor _gyroSensor = new GyroSensor();
  
  public EV3() {}

  //---- setter
  public void init()
  {
    _leftMotor.init();
    _rightMotor.init();
    _tailMotor.init();
    _gyroSensor.init();
    standby();
    Balancer.init();
  }
  
  public void setForword(int speed, int turn)
  {
    _leftMotor.setSpeed(speed - turn, Direction.Forward);
    _rightMotor.setSpeed(speed + turn, Direction.Forward);
  }
  
  public void setBackword(int speed, int turn)
  {
    _leftMotor.setSpeed(speed - turn, Direction.Backword);
    _rightMotor.setSpeed(speed + turn, Direction.Backword);
  }
    
  public GyroSensor getGyroSensor()
  {
    return _gyroSensor;
  }
  
  public TailMotor getTailMotor()
  {
    return _tailMotor;
  }
  
  private void standby()
  {
    LCD.clearDisplay();
    LCD.drawString("standby now", 0, 4);
    for ( int i = 0; i < 1; i++ )
    {
      _tailMotor.setLotate(0);
      _leftMotor.setSpeed(0);
      _rightMotor.setSpeed(0);
      _gyroSensor.getSampleData();
      Balancer.control(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8000);
    }
    Delay.msDelay(10);
    LCD.clearDisplay();
  }
}