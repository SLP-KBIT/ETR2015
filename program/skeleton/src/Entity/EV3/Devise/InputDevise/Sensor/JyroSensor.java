package Entity.EV3.Devise.InputDevise.Sensor;

public class JyroSensor extends Sensor {
  public JyroSensor(char port) {
    super(port);
  }

  public int getValue() {
    return 0;
  }

  public float getFloatValue() {
    return (float)0.0;
  }
}