package Entity.EV3.Devise.InputDevise.Sensor;

public class Encoder extends Sensor
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
