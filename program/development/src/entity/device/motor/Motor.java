package entity.device.motor;

import entity.device.Devise;
import entity.device.OutputDevise;
import lejos.hardware.motor.NXTRegulatedMotor;

public abstract class Motor extends Devise implements OutputDevise
{
  public final char motorPort;
  protected NXTRegulatedMotor motor;

  public Motor(char port)
  {
    this.motorPort = port;
    switch ( port )
    {
      case 'A' :
        this.motor = lejos.hardware.motor.Motor.A;
        break;
      case 'B' :
        this.motor = lejos.hardware.motor.Motor.B;
        break;
      case 'C' :
        this.motor = lejos.hardware.motor.Motor.C;
        break;
      case 'D' :
        this.motor = lejos.hardware.motor.Motor.D;
        break;
      default :
        break;
    }
  }

  public void setSpeed(int speed) {}

  public void setSpeed(int speed, Direction direction) {}

  public abstract void setLotate(int angle);
  
  public void stop() { this.motor.stop(); }
  
  private NXTRegulatedMotor getMotor() { return this.motor; }

  public void setValue(int value)
  {
    NXTRegulatedMotor motor = this.getMotor();
    motor.setSpeed(value);
  }
}