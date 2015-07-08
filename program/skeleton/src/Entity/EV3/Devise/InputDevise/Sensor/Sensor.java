package Entity.EV3.Devise.InputDevise.Sensor;

import Entity.EV3.Devise.InputDevise.InputDevise;

public abstract class Sensor extends InputDevise {
  public char sensorPort;

  public Sensor(char port) {
    this.sensorPort = port;
  }
}