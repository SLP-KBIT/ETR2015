package Entity.EV3;

import Entity.EV3.Devise.InputDevise.Sensor.LightSensor;
import Entity.EV3.Devise.OutputDevise.Motor.RunMotor;
import Entity.EV3.Devise.OutputDevise.Motor.TailMotor;
import Entity.EV3.Devise.InputDevise.Sensor.JyroSensor;

public class EV3
{
  // motor
  private RunMotor leftMotor;
  private RunMotor rightMotor;
  private TailMotor tailMotor;
  // sensor
  private LightSensor lightSensor;
  private JyroSensor jyroSensor;

  public EV3()
  {
    this.leftMotor = new RunMotor(1);
    this.rightMotor = new RunMotor(2);
    this.tailMotor = new TailMotor(3);
    this.lightSensor = new LightSensor('A');
    this.jyroSensor = new JyroSensor('B');
  }

  public void setTail(int lotate)
  {
    this.tailMotor.setLotate(lotate);
  }

  public void setForword(int speed, int turn)
  {
    this.leftMotor.setSpeed(speed - turn);
    this.rightMotor.setSpeed(speed + turn);
  }
  
  public JyroSensor getJyro()
  {
    return this.jyroSensor;
  }
  
  public LightSensor getLight()
  {
    return this.lightSensor;
  }
}
