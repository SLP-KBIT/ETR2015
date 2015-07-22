package entity;

import entity.device.motor.RunMotor;
import entity.device.motor.TailMotor;

public class EV3
{
  // motor
  private static final RunMotor _leftMotor = new RunMotor('A');
  private static final RunMotor _rightMotor = new RunMotor('B');
  private static final TailMotor _tailMotor = new TailMotor();
  // encoder
  //private static final Encoder _leftEncoder = new Encoder('A');
  //private static final Encoder _rightEncoder = new Encoder('B');
  // sensor
  //private static final LightSensor _lightSensor = new LightSensor();
  //private static final GyroSensor _gyroSensor = new GyroSensor();


  public EV3() {}

  //---- setter
  public void setForword(int speed, int turn)
  {
    _leftMotor.setSpeed(speed - turn);
    _rightMotor.setSpeed(speed + turn);
  }

  //--- getter
  // Gyro
  //public GyroSensor getGyro() { return _gyroSensor; }
  // Light
  //public LightSensor getLight() { return _lightSensor; }
  // LeftEncoder
  //public Encoder getLeftEncoder() { return _leftEncoder; }
  // RightEncoder
  //public Encoder getRightEncoder() { return _rightEncoder; }
  // getAvetageLotate
  //public int getAveLotate()
  //{
  //  return (_leftEncoder.getValue() + _rightEncoder.getValue()) / 2;
  //}
}