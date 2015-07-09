package Entity.EV3.Devise.OutputDevise.Motor;

import Entity.EV3.Devise.OutputDevise.OutputDevise;

public abstract class Motor extends OutputDevise
{
  public final int motorPort;

  public Motor(int port)
  {
    this.motorPort = port;
  }
  
  public abstract void setSpeed(int speed);

  public abstract void setLotate(int lotate);

  public void setValue(int value)
  {
    System.out.println("set value");
  }
}