package entity.device.motor;

import entity.device.InputDevise;

public class Encoder extends InputDevise
{
  private char _motorPort;

  public Encoder(char port)
  {
    super();
    _motorPort = port;
  }

  public int getValue()
  {
    return 0;
  }

  public float getFloatValue()
  {
    return 0.0F;
  }
}