package entity.device.motor;

import entity.device.Devise;
import entity.device.InputDevise;
import lejos.hardware.motor.NXTRegulatedMotor;

public class Encoder extends Devise implements InputDevise
{
  public final char motorPort;
  private NXTRegulatedMotor _motor;
  
  public Encoder(char port)
  {
    super();
    motorPort = port;
    switch ( port )
    {
      case 'A' :
        _motor = lejos.hardware.motor.Motor.A;
        break;
      case 'B' :
        _motor = lejos.hardware.motor.Motor.B;
        break;
      case 'C' :
        _motor = lejos.hardware.motor.Motor.C;
        break;
      case 'D' :
        _motor = lejos.hardware.motor.Motor.D;
        break;
      default :
        _motor = null;
        break;
    }
  }

  public int getValue() { return _motor.getTachoCount(); }

  public float getFloatValue() { return _motor.getPosition(); }
}