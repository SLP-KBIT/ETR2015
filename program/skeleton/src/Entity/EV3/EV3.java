package Entity.EV3;

import Entity.EV3.Devise.InputDevise.Sensor.LightSensor;
import Entity.EV3.Devise.OutputDevise.Motor.RunMotor;
import Entity.EV3.Devise.OutputDevise.Motor.TailMotor;
import Entity.EV3.Devise.InputDevise.Sensor.JyroSensor;

public class EV3 {
  // motor
  public RunMotor leftMotor;
  public RunMotor rightMotor;
  public TailMotor tailMotor;
  // sensor
  public LightSensor lightSensor;
  public JyroSensor jyroSensor;

  public EV3() {
    this.leftMotor = new RunMotor(1);
    this.rightMotor = new RunMotor(2);
    this.tailMotor = new TailMotor(3);
    this.lightSensor = new LightSensor('A');
    this.jyroSensor = new JyroSensor('B');
  }
}
