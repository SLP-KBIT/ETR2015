package Entity.EV3;

import Entity.EV3.Devise.InputDevise.Sensor.LightSensor;
import Entity.EV3.Devise.OutputDevise.Motor.RunMotor;
import Entity.EV3.Devise.OutputDevise.Motor.TailMotor;
import Entity.EV3.Devise.InputDevise.Sensor.Encoder;
import Entity.EV3.Devise.InputDevise.Sensor.GyroSensor;

public class EV3
{
  // motor
  private RunMotor _leftMotor;
  private RunMotor _rightMotor;
  private TailMotor _tailMotor;
  // sensor
  private LightSensor _lightSensor;
  private GyroSensor _gyroSensor;
  private Encoder _leftEncoder;
  private Encoder _rightEncoder;

  public EV3()
  {
    _leftMotor = new RunMotor('A');
    _rightMotor = new RunMotor('B');
    _tailMotor = new TailMotor();
    _lightSensor = new LightSensor();
    _gyroSensor = new GyroSensor();
    _leftEncoder = new Encoder('A');
    _rightEncoder = new Encoder('B');
  }

  //---- setter
  public void setTail(int lotate)
  {
    _tailMotor.setLotate(lotate);
  }

  public void setForword(int speed, int turn)
  {
    _leftMotor.setSpeed(speed - turn);
    _rightMotor.setSpeed(speed + turn);
  }

  //--- getter
  // Gyro
  public GyroSensor getGyro() { return _gyroSensor; }
  // Light
  public LightSensor getLight() { return _lightSensor; }
  // LeftEncoder
  public Encoder getLeftEncoder() { return _leftEncoder; }
  // RightEncoder
  public Encoder getRightEncoder() { return _rightEncoder; }
  // getAvetageLotate
  public int getAveLotate()
  {
    return (_leftEncoder.getValue() + _rightEncoder.getValue()) / 2;
  }
}
