package entity.device.motor;

import entity.device.Devise;
import entity.device.OutputDevise;
import lejos.hardware.motor.NXTRegulatedMotor;
import lejos.robotics.RegulatedMotor;

public abstract class Motor extends Devise implements OutputDevise
{
  public final char motorPort;
  protected RegulatedMotor motor;

  public Motor(char port)
  {
    this.motorPort = port;
    switch ( port )
    {
      case 'A':
        this.motor = lejos.hardware.motor.Motor.A;
        break;
      case 'B':
        this.motor = lejos.hardware.motor.Motor.B;
        break;
      case 'C':
        this.motor = lejos.hardware.motor.Motor.C;
        break;
      case 'D':
        this.motor = lejos.hardware.motor.Motor.D;
        break;
      default:
        break;
    }
  }
  
  public void init()
  {
    this.motor.resetTachoCount();
    this.motor.rotateTo(0);
  }

  public void setSpeed(int speed) {}

  public void setSpeed(int speed, Direction direction) {}

  public abstract void setLotate(int angle);
  
  public void stop() { this.motor.stop(); }
  
  private RegulatedMotor getMotor() { return this.motor; }

  public void setValue(int value)
  {
    this.motor.setSpeed(value);
  }
}